package com.lior.MenoraDemo.parsers;

import com.lior.MenoraDemo.model.RootDocument;
import com.thoughtworks.xstream.XStream;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class RootXmlParser {

    private XStream xStream;
    private File filePath;

    public RootXmlParser() {
        xStream = new XStream();
    }

    public RootXmlParser(File filePath) {
        xStream = new XStream();
        this.filePath = filePath;
    }

    public RootDocument parse() {
        String xml = null;
        try {
            xml = new String(Files.readAllBytes(filePath.toPath()));
            return (RootDocument) xStream.fromXML(xml);

        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public XStream getXStream() {
        return xStream;
    }

    public void setXStream(XStream xStream) {
        this.xStream = xStream;
    }

    public File getFilePath() {
        return filePath;
    }

    public void setFilePath(File filePath) {
        this.filePath = filePath;
    }
}
