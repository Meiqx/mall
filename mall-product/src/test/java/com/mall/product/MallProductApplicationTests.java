package com.mall.product;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.mall.product.entity.BrandEntity;
import com.mall.product.service.BrandService;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@SpringBootTest
class MallProductApplicationTests {

    @Autowired
    BrandService brandService;

    @Test
    void contextLoad() {

        BrandEntity brandEntity = new BrandEntity();

//        brandEntity.setBrandId(1L);
//        brandEntity.setDescript("荣耀");
//        brandService.updateById(brandEntity);
//        System.err.println("修改成功");

//        brandEntity.setName("小米");
//        brandService.save(brandEntity);
//        System.err.println("保存成功'''''''");

       List<BrandEntity> list = brandService.list(new QueryWrapper<BrandEntity>().eq("brand_id",1L));
       list.forEach((iter)->{
           System.err.println(iter);
       });

    }

}
