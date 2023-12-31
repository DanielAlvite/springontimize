package com.campusdual.springontimize.model.core.dao;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Repository;

import com.ontimize.jee.server.dao.common.ConfigurationFile;
import com.ontimize.jee.server.dao.jdbc.OntimizeJdbcDaoSupport;


@Lazy
@Repository(value = "ProductDao")
@ConfigurationFile(
        configurationFile = "dao/ProductDao.xml",
        configurationFilePlaceholder = "dao/placeholders.properties")
public class ProductDao extends OntimizeJdbcDaoSupport {

    public static final String ATTR_ID = "ID";
    public static final String ATTR_NAME = "NAME";
    public static final String ATTR_STOCK = "STOCK";
    public static final String ATTR_PRICE = "PRICE";
    public static final String ATTR_ACTIVE = "ACTIVE";
    public static final String ATTR_DATE_ADDED = "DATE_ADDED";

}