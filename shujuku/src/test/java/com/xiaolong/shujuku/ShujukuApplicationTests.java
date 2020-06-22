package com.xiaolong.shujuku;

import com.xiaolong.shujuku.dao.studentmapper;
import org.junit.jupiter.api.Test;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@MapperScan("com.xiaolong.shujuku.dao")
class ShujukuApplicationTests {

    @Autowired
    private com.xiaolong.shujuku.dao.studentmapper studentmapper;

    @Test
    void select() {
        System.out.println(studentmapper.findall());
    }

    @Test
    void insert(){
        System.out.println(studentmapper.insert(100,"小可爱"));
    }

    @Test
    void update(){
        System.out.println(studentmapper.update("大可爱",100));
    }

    @Test
    void del(){
        System.out.println(studentmapper.del(100));
    }


}
