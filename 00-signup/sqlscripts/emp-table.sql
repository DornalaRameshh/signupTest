DROP SCHEMA IF EXISTS `emp_directory`;
CREATE SCHEMA `emp_directory`;
CREATE TABLE `emp` (
  `id` int NOT NULL AUTO_INCREMENT,
  `email` varchar(45) DEFAULT NULL,
  `name` varchar(45) DEFAULT NULL,
  `password` varchar(45) DEFAULT NULL,
  `phone_num` varchar(45) DEFAULT NULL,
   PRIMARY KEY (`id`)
   )ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;
   

