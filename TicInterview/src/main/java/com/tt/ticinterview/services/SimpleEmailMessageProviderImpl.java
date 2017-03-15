package com.tt.ticinterview.services;

import org.springframework.batch.item.file.separator.ResourceLineReader;
import org.springframework.core.io.Resource;

import java.io.IOException;
import java.util.Map;

/**
 * Created by Tictum on 15/03/2017.
 */
public class SimpleEmailMessageProviderImpl implements EmailMessageProvider {
    private Map<String,Resource> inlineFiles;

    private String subject;

    private String body;

    @SuppressWarnings("unused")
    private Resource template;

    public String getSubject(){
        return subject;
    }

    public void setSubject(String subject){
        this.subject = subject;
    }

    public String getBody() {
        return body;
    }

    public Map<String, Resource> getInlineFiles() {
        return inlineFiles;
    }

    public void setInlineFiles(Map<String, Resource> inlineFiles) {
        this.inlineFiles = inlineFiles;
    }

    public void setTemplate(Resource template) throws IOException {
        StringBuffer fileContent = new StringBuffer();
        ResourceLineReader reader = new ResourceLineReader(template);
        String line;
        while ((line = (String) reader.read()) != null) {
            fileContent.append(line);
        }
        this.body = fileContent.toString();
    }
}
