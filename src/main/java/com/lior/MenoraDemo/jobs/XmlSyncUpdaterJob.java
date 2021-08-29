package com.lior.MenoraDemo.jobs;

import com.lior.MenoraDemo.db.RootDocumentRepository;
import com.lior.MenoraDemo.model.RootDocument;
import com.lior.MenoraDemo.parsers.RootXmlParser;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.scheduling.quartz.QuartzJobBean;

import java.io.File;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class XmlSyncUpdaterJob extends QuartzJobBean {

    @Autowired
    @Qualifier("menora.data_folder")
    private File folderPath;

    @Autowired
    private RootDocumentRepository rootDocumentRepository;

    @Override
    protected void executeInternal(JobExecutionContext jobExecutionContext) throws JobExecutionException {
        try {
            rootDocumentRepository.saveAll(Arrays.asList(folderPath.listFiles()).stream()
                    .map(RootXmlParser::new)
                    .map(RootXmlParser::parse)
                    .collect(Collectors.toList()));
        } catch (Exception e) {

        }
    }
}
