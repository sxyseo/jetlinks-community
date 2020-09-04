package org.jetlinks.community.notify.email.embedded;

import lombok.Getter;
import lombok.Setter;
import org.jetlinks.community.notify.template.Template;

import java.util.List;

@Getter
@Setter
public class EmailTemplate implements Template {

    private String subject;

    private String text;

    private List<Attachment> attachments;

    private List<String> sendTo;

    @Getter
    @Setter
    public static class Attachment {

        private String name;

        private String location;

    }
}
