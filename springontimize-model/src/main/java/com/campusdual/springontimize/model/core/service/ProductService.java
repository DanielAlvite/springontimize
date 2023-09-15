package com.campusdual.springontimize.model.core.service;

import com.campusdual.springontimize.api.core.service.IProductService;
import com.campusdual.springontimize.model.core.dao.ProductDao;
import com.ontimize.jee.common.dto.EntityResult;
import com.ontimize.jee.server.dao.DefaultOntimizeDaoHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Lazy
@Service("ProductService")
public class ProductService implements IProductService {

    @Autowired
    private DefaultOntimizeDaoHelper daoHelper;
    @Autowired
    private ProductDao productDao;

    @Override
    public EntityResult contactQuery(Map<String, Object> keyMap, List<String> attrList) {
        return this.daoHelper.query(this.productDao, keyMap ,attrList);
    }

    @Override
    public EntityResult contactInsert(Map<String, Object> attrMap) {
        return this.daoHelper.insert(this.productDao, attrMap);
    }

    @Override
    public EntityResult contactUpdate(Map<String, Object> attrMap, Map<String, Object> keyMap) {
        return this.daoHelper.update(this.productDao, attrMap , keyMap);
    }

    @Override
    public EntityResult contactDelete(Map<String, Object> keyMap) {
        return this.daoHelper.delete(this.productDao, keyMap);
    }
}
