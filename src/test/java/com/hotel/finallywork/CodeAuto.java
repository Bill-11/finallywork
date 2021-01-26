package com.hotel.finallywork;

import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.baomidou.mybatisplus.generator.config.PackageConfig;
import com.baomidou.mybatisplus.generator.config.StrategyConfig;
import com.baomidou.mybatisplus.generator.config.po.TableFill;
import com.baomidou.mybatisplus.generator.config.rules.DateType;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;


import java.util.ArrayList;

//代码自动生成器
public class CodeAuto {
    public static void main(String[] args) {
        AutoGenerator mpg = new AutoGenerator();
        //配置策略
        //全局配置
        GlobalConfig gc = new GlobalConfig();
        String projectPath =System.getProperty("user.dir");
        gc.setOutputDir(projectPath +"/src/main/java");
        gc.setAuthor("hotelfinallywork");
        gc.setOpen(false);
        gc.setFileOverride(false); //是否覆盖
        gc.setServiceName("%sService");
        gc.setIdType(IdType.ID_WORKER);
        gc.setDateType(DateType.ONLY_DATE);
        mpg.setGlobalConfig(gc);


        // 数据源配置
        DataSourceConfig dsc = new DataSourceConfig();
        dsc.setUrl("jdbc:mysql://localhost:3306/hotel?useSSL=false&useUnicode=true&characterEncoding=utf-8&serverTimezone=UTC");
        dsc.setDriverName("com.mysql.cj.jdbc.Driver");
        dsc.setUsername("root");
        dsc.setPassword("zxs284535");
        dsc.setDbType(DbType.MYSQL);
        mpg.setDataSource(dsc);

        //配置包
        PackageConfig pc = new PackageConfig();
        pc.setModuleName("hotel");
        pc.setParent("com.hotel.finallywork");
        pc.setEntity("entity");
        pc.setMapper("mapper");
        pc.setService("service");
        pc.setController("controller");
        mpg.setPackageInfo(pc);

        //策略配置
        StrategyConfig strategy = new StrategyConfig();
        strategy.setInclude("hotelfood","hotelroom","orderfood","orderroom","roomtype","user");
        strategy.setNaming(NamingStrategy.underline_to_camel);
        strategy.setColumnNaming(NamingStrategy.underline_to_camel);
        strategy.setEntityLombokModel(true);

        strategy.setLogicDeleteFieldName("deleted");
        // 自动填充
        TableFill gmtCreate = new TableFill("gmt_create",FieldFill.INSERT);
        TableFill gmtModified = new TableFill("gmt_modified", FieldFill.INSERT_UPDATE);
        ArrayList<TableFill> tableFills=new ArrayList<>();
        tableFills.add(gmtCreate);
        tableFills.add(gmtModified);

        strategy.setVersionFieldName("version");
        strategy.setRestControllerStyle(true);
        mpg.setStrategy(strategy);


        mpg.execute();
    }
}
