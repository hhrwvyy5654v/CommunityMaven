DROP DATABASE IF EXISTS communitymaven; #先判断是否存在名为communitymaven的数据库,如果存在则删除该数据库
CREATE DATABASE communitymaven; #创建一个名为communitymaven的数据库
USE communitymaven; #将当前数据库设置为communitymaven,后续对数据表的操作都将在该数据库中进行
SET FOREIGN_KEY_CHECKS = 0; # 禁用外键约束检查,可以在进行大量数据插入或更新时提高效率


DROP TABLE IF EXISTS `building`;
CREATE TABLE `building`
(                                             #创建管理楼房信息的数据表
    `id`     int(10) NOT NULL AUTO_INCREMENT, #主键,自增长的整数类型
    `number` varchar(50)  DEFAULT NULL,       #栋编号,字符串类型,长度为50
    `unit`   varchar(50)  DEFAULT NULL,       #单元编号,字符串类型,长度为50
    `remark` varchar(250) DEFAULT NULL,       #备注信息,字符串类型,长度为250
    PRIMARY KEY (`id`)
) ENGINE = InnoDB
  AUTO_INCREMENT = 14
  DEFAULT CHARSET = utf8;
# 使用了InnoDB引擎,初始自增长ID为14,字符集为utf8


DROP TABLE IF EXISTS `carcharge`;
CREATE TABLE `carcharge`
(                                                             #创建管理收费信息的数据表
    `id`       int(10) NOT NULL AUTO_INCREMENT,               #主键,自增长的整数类型
    `pay_date` datetime      DEFAULT NULL,                    #缴费日期,日期时间类型
    `end_date` varchar(25)   DEFAULT NULL,                    #缴费结束日期,字符串类型,长度为25
    `money`    double(10, 2) DEFAULT NULL,                    #缴费金额,双精度浮点型,最多保留两位小数
    `status`   int(2)        DEFAULT NULL,                    #缴费状态,整数类型,最多两位数
    `owner_id` int(10)       DEFAULT NULL,                    #车主ID,整数类型,最多10位数。
    `remarks`  varchar(255)  DEFAULT NULL,                    #备注信息,字符串类型,长度为255
    `type`     varchar(10)   DEFAULT NULL COMMENT '收费类型', #收费类型,字符串类型,长度为10
    `park_id`  int(10)       DEFAULT NULL,                    #停车场ID,整数类型,最多10位数
    PRIMARY KEY (`id`)
) ENGINE = InnoDB
  AUTO_INCREMENT = 11
  DEFAULT CHARSET = utf8;
# 使用InnoDB引擎,初始自增长ID为11,字符集为UTF-8


DROP TABLE IF EXISTS `clockin`;
CREATE TABLE `clockin`
(                                                    #创建用于记录业主的打卡信息的数据表
    `id`            int(11) NOT NULL AUTO_INCREMENT, #主键,自增长的整数类型
    `clock_in_time` datetime DEFAULT NULL,           #打卡时间,日期时间类型
    `owner_id`      int(11)  DEFAULT NULL,           #业主ID,整数类型,最多11位数
    `house_id`      int(11)  DEFAULT NULL,           #房屋ID,整数类型,最多11位数
    `building_id`   int(11)  DEFAULT NULL,           #楼房ID,整数类型,最多11位数
    PRIMARY KEY (`id`)
) ENGINE = InnoDB
  AUTO_INCREMENT = 16
  DEFAULT CHARSET = utf8;
# 使用InnoDB引擎,初始自增长ID为16,字符集为UTF-8


DROP TABLE IF EXISTS `clockinnew`;
CREATE TABLE `clockinnew`
(                                                                                        #创建于记录业主的健康状况信息的数据表
    `id`            int(11) NOT NULL AUTO_INCREMENT,                                     #主键,自增长的整数类型
    `report_date`   datetime     DEFAULT NULL,                                           #报告日期,日期时间类型
    `owner_id`      int(11)      DEFAULT NULL,                                           #业主ID,整数类型,最多11位数
    `type1`         int(11)      DEFAULT NULL COMMENT '是否为疑似病例如咳嗽,发热(0或1)', #是否为疑似病例,整数类型,最多11位数,值为0或1
    `type2`         int(11)      DEFAULT NULL COMMENT '是否确诊为肺炎病例',              #是否确诊为肺炎病例,整数类型,最多11位数,值为0或1
    `today_address` varchar(100) DEFAULT NULL,                                           #当天所在地点,字符串类型,长度为100
    `remarks`       varchar(255) DEFAULT NULL,                                           #备注信息,字符串类型,长度为255
    PRIMARY KEY (`id`)
) ENGINE = InnoDB
  AUTO_INCREMENT = 20
  DEFAULT CHARSET = utf8;
# 使用InnoDB引擎，初始自增长ID为20，字符集为UTF-8


DROP TABLE IF EXISTS `complaint`;
CREATE TABLE `complaint`
(                                                             #创建用于记录业主的投诉信息的数据表
    `id`          int(11) NOT NULL AUTO_INCREMENT,            #主键，自增长的整数类型
    `com_id`      varchar(25)  DEFAULT NULL,                  #投诉编号，字符串类型，长度为25
    `com_date`    datetime     DEFAULT NULL,                  #投诉日期，日期时间类型
    `handle_date` datetime     DEFAULT NULL,                  #处理日期，日期时间类型
    `owner_id`    int(11)      DEFAULT NULL,                  #业主ID，整数类型，最多11位数
    `status`      int(2)       DEFAULT NULL,                  #投诉状态，整数类型，最多2位数
    `clr`         int(11)      DEFAULT NULL COMMENT '处理人', #处理人，整数类型，最多11位数
    `remarks`     varchar(255) DEFAULT NULL,                  #备注信息，字符串类型，长度为255
    PRIMARY KEY (`id`)
) ENGINE = InnoDB
  AUTO_INCREMENT = 5
  DEFAULT CHARSET = utf8;
#使用InnoDB引擎，初始自增长ID为5，字符集为UTF-8


DROP TABLE IF EXISTS `complaint_type`;
CREATE TABLE `complaint_type`
(                                              #创建用于记录投诉类型的信息的数据表
    `id`      int(10) NOT NULL AUTO_INCREMENT, #主键，自增长的整数类型
    `name`    varchar(50)  DEFAULT NULL,       #投诉类型名称，字符串类型，长度为50
    `remarks` varchar(250) DEFAULT NULL,       #备注信息，字符串类型，长度为250
    `status`  int(10)      DEFAULT NULL,       #投诉类型状态，整数类型，最多10位数
    PRIMARY KEY (`id`)
) ENGINE = InnoDB
  AUTO_INCREMENT = 3
  DEFAULT CHARSET = utf8;
#使用InnoDB引擎，初始自增长ID为3，字符集为UTF-8


DROP TABLE IF EXISTS `house`;
CREATE TABLE `house`
(                                                 #创建用于记录房屋的信息的数据表
    `id`          int(5) NOT NULL AUTO_INCREMENT, #主键，自增长的整数类型，最多5位数
    `storey`      int(5)        DEFAULT NULL,     #楼层数，整数类型，最多5位数
    `numbers`     varchar(50)   DEFAULT NULL,     #房屋号，字符串类型，长度为50
    `status`      int(5)        DEFAULT NULL,     #房屋状态，整数类型，最多5位数
    `into_date`   datetime      DEFAULT NULL,     #入住日期，日期时间类型
    `building_id` int(5)        DEFAULT NULL,     #所在楼宇ID，整数类型，最多5位数
    `remarks`     varchar(50)   DEFAULT NULL,     #备注信息，字符串类型，长度为50
    `area`        double(10, 2) DEFAULT NULL,     #房屋面积，双精度浮点数类型，最多10位数，保留2位小数
    PRIMARY KEY (`id`)
) ENGINE = InnoDB
  AUTO_INCREMENT = 6
  DEFAULT CHARSET = utf8;
#使用InnoDB引擎，初始自增长ID为6，字符集为UTF-8


DROP TABLE IF EXISTS `notice`;
CREATE TABLE `notice`
(                                                       #创建用于记录公告的信息的信息表
    `id`      int(11) NOT NULL AUTO_INCREMENT,          #主键，自增长的整数类型
    `topic`   varchar(100) DEFAULT NULL COMMENT '主题', #公告主题，字符串类型，长度为100
    `content` varchar(250) DEFAULT NULL,                #公告内容，字符串类型，长度为250
    `fbr`     varchar(50)  DEFAULT NULL,                #发布人，字符串类型，长度为50
    `fbdate`  datetime     DEFAULT NULL,                #发布人，字符串类型，长度为50
    `remarks` varchar(20)  DEFAULT NULL,                #备注信息，字符串类型，长度为20
    PRIMARY KEY (`id`)
) ENGINE = InnoDB
  AUTO_INCREMENT = 2
  DEFAULT CHARSET = utf8;
#使用InnoDB引擎，初始自增长ID为2，字符集为UTF-8


DROP TABLE IF EXISTS `owner`;
CREATE TABLE `owner`
(                                              #创建用于记录业主的信息的数据表
    `id`       int(5) NOT NULL AUTO_INCREMENT, #主键，自增长的整数类型，最多5位数
    `username` varchar(25)  DEFAULT NULL,      #业主姓名，字符串类型，长度为25
    `tel`      varchar(25)  DEFAULT NULL,      #联系电话，字符串类型，长度为25
    `sex`      varchar(5)   DEFAULT NULL,      #性别，字符串类型，长度为5
    `identity` varchar(25)  DEFAULT NULL,      #身份证号，字符串类型，长度为25
    `house_id` int(11)      DEFAULT NULL,      #房屋ID，整数类型，最多11位数
    `remarks`  varchar(255) DEFAULT NULL,      #备注信息，字符串类型，长度为255
    `password` varchar(28)  DEFAULT NULL,      #密码，字符串类型，长度为28
    PRIMARY KEY (`id`)
) ENGINE = InnoDB
  AUTO_INCREMENT = 10
  DEFAULT CHARSET = utf8;
#使用InnoDB引擎，初始自增长ID为10，字符集为UTF-8


DROP TABLE IF EXISTS `parking`;
CREATE TABLE `parking`
(                                               #创建用于记录车位的信息的数据表
    `id`       int(11) NOT NULL AUTO_INCREMENT, #主键，自增长的整数类型
    `numbers`  varchar(25)  DEFAULT NULL,       #车位编号，字符串类型，长度为25
    `status`   int(11)      DEFAULT NULL,       #车位状态，整数类型，最多11位数
    `owner_id` int(11)      DEFAULT NULL,       #业主ID，整数类型，最多11位数
    `remarks`  varchar(255) DEFAULT NULL,       #备注信息，字符串类型，长度为255
    PRIMARY KEY (`id`)
) ENGINE = InnoDB
  AUTO_INCREMENT = 3
  DEFAULT CHARSET = utf8;
#使用InnoDB引擎，初始自增长ID为3，字符集为UTF-8


DROP TABLE IF EXISTS `property_info`;
CREATE TABLE `property_info`
(                                                 #创建用于记录物业费收费信息的数据表
    `id`         int(11) NOT NULL AUTO_INCREMENT, #主键，自增长的整数类型
    `type_id`    int(11)       DEFAULT NULL,      #物业类型ID，整数类型，最多11位数
    `money`      double(10, 2) DEFAULT NULL,      #物业费用，浮点数类型，共10位，其中小数点后2位
    `start_date` datetime      DEFAULT NULL,      #收费开始日期，日期时间类型
    `end_date`   datetime      DEFAULT NULL,      #收费结束日期，日期时间类型
    `status`     int(2)        DEFAULT NULL,      #收费状态，整数类型，最多2位数
    `house_id`   int(11)       DEFAULT NULL,      #房屋ID，整数类型，最多11位数
    `remarks`    varchar(200)  DEFAULT NULL,      #备注信息，字符串类型，长度为200
    PRIMARY KEY (`id`)
) ENGINE = InnoDB
  AUTO_INCREMENT = 41
  DEFAULT CHARSET = utf8;
#使用InnoDB引擎，初始自增长ID为41，字符集为UTF-8


DROP TABLE IF EXISTS `property_type`;
CREATE TABLE `property_type`
(                                              #创建用于记录物业费类型信息的数据表
    `id`      int(11) NOT NULL AUTO_INCREMENT, #主键，自增长的整数类型
    `name`    varchar(25)   DEFAULT NULL,      #物业类型名称，字符串类型，长度为25
    `price`   double(10, 2) DEFAULT NULL,      #物业费单价，浮点数类型，共10位，其中小数点后2位
    `unit`    varchar(25)   DEFAULT NULL,      #物业费计量单位，字符串类型，长度为25
    `remarks` varchar(255)  DEFAULT NULL,      #备注信息，字符串类型，长度为255
    PRIMARY KEY (`id`)
) ENGINE = InnoDB
  AUTO_INCREMENT = 5
  DEFAULT CHARSET = utf8;
#使用InnoDB引擎，初始自增长ID为5，字符集为UTF-8


DROP TABLE IF EXISTS `records`;
CREATE TABLE `records`
(                                                 #创建用于记录各种类型的记录信息的数据表
    `id`         int(11) NOT NULL AUTO_INCREMENT, #主键，自增长的整数类型
    `type_id`    int(11)      DEFAULT NULL,       #记录类型ID，整数类型，最多11位数
    `num`        double(5, 2) DEFAULT NULL,       #记录数值1，浮点数类型，共5位，其中小数点后2位
    `num2`       double(5, 2) DEFAULT NULL,       #记录数值2，浮点数类型，共5位，其中小数点后2位
    `house_id`   int(11)      DEFAULT NULL,       #房屋ID，整数类型，最多11位数
    `up_time`    datetime     DEFAULT NULL,       #上传时间，日期时间类型
    `on_time`    datetime     DEFAULT NULL,       #操作时间，日期时间类型
    `check_time` datetime     DEFAULT NULL,       #审核时间，日期时间类型
    `meter`      varchar(25)  DEFAULT NULL,       #仪表编号，字符串类型，长度为25
    `remarks`    varchar(255) DEFAULT NULL,       #备注信息，字符串类型，长度为255
    PRIMARY KEY (`id`)
) ENGINE = InnoDB
  AUTO_INCREMENT = 11
  DEFAULT CHARSET = utf8;
#使用InnoDB引擎，初始自增长ID为11，字符集为UTF-8


DROP TABLE IF EXISTS `repair`;
CREATE TABLE `repair`
(                                                  #创建用于记录报修信息的数据表
    `id`          int(11) NOT NULL AUTO_INCREMENT, #主键，自增长的整数类型
    `com_id`      varchar(25)  DEFAULT NULL,       #报修单号，字符串类型，长度为25
    `com_date`    datetime     DEFAULT NULL,       #报修日期，日期时间类型
    `handle_date` datetime     DEFAULT NULL,       #处理日期，日期时间类型
    `owner_id`    int(11)      DEFAULT NULL,       #业主ID，整数类型，最多11位数
    `status`      int(2)       DEFAULT NULL,       #报修状态，整数类型，最多2位数
    `clr`         int(11)      DEFAULT NULL,       #处理人ID，整数类型，最多11位数
    `remarks`     varchar(255) DEFAULT NULL,       #备注信息，字符串类型，长度为255
    PRIMARY KEY (`id`)
) ENGINE = InnoDB
  AUTO_INCREMENT = 15
  DEFAULT CHARSET = utf8;
#使用InnoDB引擎，初始自增长ID为15，字符集为UTF-8


DROP TABLE IF EXISTS repair_type;
CREATE TABLE `repairtype`
(                                              #创建用于记录报修类型信息的数据表
    `id`      int(11) NOT NULL AUTO_INCREMENT, #主键，自增长的整数类型
    `name`    varchar(50)  DEFAULT NULL,       #报修类型名称，字符串类型，长度为5
    `remarks` varchar(250) DEFAULT NULL,       #备注信息，字符串类型，长度为250
    `status`  int(11)      DEFAULT NULL,       #状态，整数类型，最多11位数
    PRIMARY KEY (`id`)
) ENGINE = InnoDB
  AUTO_INCREMENT = 8
  DEFAULT CHARSET = utf8;
#使用InnoDB引擎，初始自增长ID为8，字符集为UTF-8


DROP TABLE IF EXISTS `userinfo`;
CREATE TABLE `userinfo`
(                                               #创建用于记录用户信息的数据表
    `id`       int(11) NOT NULL AUTO_INCREMENT, #主键，自增长的整数类型
    `username` varchar(20)  DEFAULT NULL,       #用户名，字符串类型，长度为20
    `password` varchar(20)  DEFAULT NULL,       #密码，字符串类型，长度为20
    `type`     int(11)      DEFAULT NULL,       #用户类型，整数类型，最多11位数
    `remarks`  varchar(200) DEFAULT NULL,       #备注信息，字符串类型，长度为200
    PRIMARY KEY (`id`)
) ENGINE = InnoDB
  AUTO_INCREMENT = 13
  DEFAULT CHARSET = utf8;
#使用InnoDB引擎，初始自增长ID为13，字符集为UTF-8