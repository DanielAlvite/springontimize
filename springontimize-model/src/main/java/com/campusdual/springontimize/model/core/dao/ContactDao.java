package com.campusdual.springontimize.model.core.dao;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Repository;

import com.ontimize.jee.server.dao.common.ConfigurationFile;
import com.ontimize.jee.server.dao.jdbc.OntimizeJdbcDaoSupport;


@Lazy
@Repository(value = "ContactDao")
@ConfigurationFile(
        configurationFile = "dao/ContactDao.xml",
        configurationFilePlaceholder = "dao/placeholders.properties")
public class ContactDao extends OntimizeJdbcDaoSupport {

    public static final String ATTR_ID = "ID";
    public static final String ATTR_NAME = "NAME";
    public static final String ATTR_SURNAME1 = "SURNAME1";
    public static final String ATTR_SURNAME2 = "SURNAME2";
    public static final String ATTR_PHONE = "PHONE";
    public static final String ATTR_EMAIL = "EMAIL";

}
