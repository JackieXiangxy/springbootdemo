package com.jackie.myapp;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.baomidou.mybatisplus.core.exceptions.MybatisPlusException;
import com.baomidou.mybatisplus.core.toolkit.StringPool;
import com.baomidou.mybatisplus.core.toolkit.StringUtils;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.InjectionConfig;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.FileOutConfig;
import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.baomidou.mybatisplus.generator.config.PackageConfig;
import com.baomidou.mybatisplus.generator.config.StrategyConfig;
import com.baomidou.mybatisplus.generator.config.TemplateConfig;
import com.baomidou.mybatisplus.generator.config.po.TableInfo;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;
import com.baomidou.mybatisplus.generator.engine.FreemarkerTemplateEngine;

public class CodeGenerator {

 public static void main(String[] args) {
     // 代码生成器
     AutoGenerator mpg = new AutoGenerator();


     // 全局配置
     GlobalConfig gc = new GlobalConfig();
     String projectPath = System.getProperty("user.dir");
     gc.setOutputDir(projectPath + "/src/main/java");
     gc.setAuthor("jackie");
     gc.setOpen(false);
     mpg.setGlobalConfig(gc);

     // 数据源配置
     DataSourceConfig dsc = new DataSourceConfig();
     dsc.setUrl("jdbc:mysql://localhost:3306/test?useUnicode=true&useSSL=true&characterEncoding=utf8&serverTimezone=GMT%2B8");
     // dsc.setSchemaName("public");
     dsc.setDriverName("com.mysql.jdbc.Driver");
     dsc.setUsername("root");
     dsc.setPassword("admin");
     mpg.setDataSource(dsc);

     // 包配置
     PackageConfig pc = new PackageConfig();
     pc.setModuleName("system");
     pc.setParent("com.jackie.myapp");
     mpg.setPackageInfo(pc);

     // 自定义配置
     InjectionConfig cfg = new InjectionConfig() {
         @Override
         public void initMap() {
             // to do nothing
         }
     };

     // 如果模板引擎是 freemarker
     String templatePath = "/templates/mapper.xml.ftl";
     // 如果模板引擎是 velocity
     // String templatePath = "/templates/mapper.xml.vm";

     // 自定义输出配置
     List<FileOutConfig> focList = new ArrayList<>();
     // 自定义配置会被优先输出
     focList.add(new FileOutConfig(templatePath) {
         @Override
         public String outputFile(TableInfo tableInfo) {
             // 自定义输出文件名
             return projectPath + "/src/main/resources/mapper/" + pc.getModuleName()
                     + "/" + tableInfo.getEntityName() + "Mapper" + StringPool.DOT_XML;
         }
     });

     cfg.setFileOutConfigList(focList);
     mpg.setCfg(cfg);

     // 配置模板
     TemplateConfig templateConfig = new TemplateConfig();

     // 配置自定义输出模板
     //指定自定义模板路径，注意不要带上.ftl/.vm, 会根据使用的模板引擎自动识别
     // templateConfig.setEntity("templates/entity2.java");
     // templateConfig.setService();
     // templateConfig.setController();
     
     templateConfig.setXml(null);
     mpg.setTemplate(templateConfig);

     // 策略配置
     StrategyConfig strategy = new StrategyConfig();
     strategy.setNaming(NamingStrategy.underline_to_camel);
     strategy.setColumnNaming(NamingStrategy.underline_to_camel);
//     strategy.setSuperEntityClass("com.baomidou.ant.common.BaseEntity");
     strategy.setEntityLombokModel(true);
     strategy.setRestControllerStyle(true);
//     strategy.setSuperControllerClass("com.baomidou.ant.common.BaseController");
//     strategy.setInclude(scanner("表名"));
     //输入表名
//     strategy.setInclude("qrtz_blob_triggers");
//     strategy.setInclude("qrtz_calendars");
//     strategy.setInclude("qrtz_cron_triggers");
//     strategy.setInclude("qrtz_fired_triggers");
//     strategy.setInclude("qrtz_job_details");
//     strategy.setInclude("qrtz_locks");
//     strategy.setInclude("qrtz_paused_trigger_grps");
//     strategy.setInclude("qrtz_scheduler_state");
//     strategy.setInclude("qrtz_simple_triggers");
//     strategy.setInclude("qrtz_simprop_triggers");
//     strategy.setInclude("qrtz_triggers");
//     strategy.setInclude("t_dept");
//     strategy.setInclude("t_dict");
//     strategy.setInclude("t_job");
//     strategy.setInclude("t_job_log");
//     strategy.setInclude("t_log");
//     strategy.setInclude("t_menu");
//     strategy.setInclude("t_role");
//     strategy.setInclude("t_role_menu");
//     strategy.setInclude("t_user");
//     strategy.setInclude("t_user_role");
//     strategy.setSuperEntityColumns("id");
     strategy.setControllerMappingHyphenStyle(true);
     strategy.setTablePrefix(pc.getModuleName() + "_");
     mpg.setStrategy(strategy);
     mpg.setTemplateEngine(new FreemarkerTemplateEngine());
     mpg.execute();
 }

}
