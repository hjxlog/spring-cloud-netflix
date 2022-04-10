CREATE TABLE `dept` (
  `deptno` int NOT NULL AUTO_INCREMENT,
  `dname` varchar(255) DEFAULT NULL,
  `db_source` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`deptno`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;

insert into dept
(dname,db_source)
VALUES
('开发部',database()),
('人事部',database()),
('财务部',database()),
('市场部',database()),
('运维部',database());
