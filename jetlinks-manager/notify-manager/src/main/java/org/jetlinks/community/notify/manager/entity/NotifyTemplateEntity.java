package org.jetlinks.community.notify.manager.entity;

import lombok.Getter;
import lombok.Setter;
import org.hswebframework.ezorm.rdb.mapping.annotation.ColumnType;
import org.hswebframework.ezorm.rdb.mapping.annotation.Comment;
import org.hswebframework.web.api.crud.entity.GenericEntity;
import org.hswebframework.web.crud.annotation.EnableEntityEvent;
import org.jetlinks.community.notify.template.TemplateProperties;

import javax.persistence.Column;
import javax.persistence.Table;
import java.sql.JDBCType;

/**
 * @author wangzheng
 * @author zhouhao
 * @since 1.0
 */
@Setter
@Getter
@Table(name = "notify_template")
@EnableEntityEvent
public class NotifyTemplateEntity extends GenericEntity<String> {

    @Column
    @Comment("通知类型")
    private String type;

    @Column
    @Comment("通知服务商")
    private String provider;

    @Column
    @Comment("模板名称")
    private String name;

    @Comment("模板内容")
    @Column
    @ColumnType(jdbcType = JDBCType.CLOB)
    private String template;


    public TemplateProperties toTemplateProperties() {
        TemplateProperties properties = new TemplateProperties();
        properties.setProvider(provider);
        properties.setType(type);
        properties.setTemplate(template);
        return properties;
    }
}
