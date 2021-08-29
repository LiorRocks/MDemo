package com.lior.MenoraDemo.parsers;

import com.lior.MenoraDemo.model.RootDocument;
import com.thoughtworks.xstream.XStream;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class RootXmlParser {

    private XStream xStream;
    private Path filePath;

    public RootXmlParser() {
        xStream = new XStream();
    }

    public RootXmlParser(Path filePath) {
        xStream = new XStream();
        this.filePath = filePath;
    }

    public RootDocument parse() throws IOException {
        String xml = new String(Files.readAllBytes(filePath));
        return (RootDocument) xStream.fromXML(xml);
    }

    public XStream getXStream() {
        return xStream;
    }

    public void setXStream(XStream xStream) {
        this.xStream = xStream;
    }

    public Path getFilePath() {
        return filePath;
    }

    public void setFilePath(Path filePath) {
        this.filePath = filePath;
    }
}
