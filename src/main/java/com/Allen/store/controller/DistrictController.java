package com.Allen.store.controller;

import com.Allen.store.entity.District;
import com.Allen.store.service.IDistrictService;
import com.Allen.store.util.JsonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author 邓志恒
 * @version 1.0
 **/
@RestController
@RequestMapping("districts")
public class DistrictController extends BaseController{
    @Autowired
    private IDistrictService districtService;;

    @GetMapping({"", "/"})
    public JsonResult<List<District>> getByParentId(String parent){
        List<District> data = districtService.getByParent(parent);
        return new JsonResult<>(OK, data);
    }
}
