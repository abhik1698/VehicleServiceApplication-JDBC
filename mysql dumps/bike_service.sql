-- MySQL dump 10.13  Distrib 8.0.13, for Win64 (x86_64)
--
-- Host: localhost    Database: bike_service
-- ------------------------------------------------------
-- Server version	8.0.13

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
 SET NAMES utf8 ;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `backup_bike_model`
--

DROP TABLE IF EXISTS `backup_bike_model`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `backup_bike_model` (
  `bike_name` varchar(50) DEFAULT NULL,
  `registration_no` varchar(45) NOT NULL,
  `bike_color` varchar(45) DEFAULT NULL,
  `kilometers_run` int(11) DEFAULT NULL,
  `time_stamp` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`registration_no`,`time_stamp`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `backup_bike_model`
--

LOCK TABLES `backup_bike_model` WRITE;
/*!40000 ALTER TABLE `backup_bike_model` DISABLE KEYS */;
INSERT INTO `backup_bike_model` VALUES ('1','1','1',1,'2018-11-24 19:45:45'),('1','12','1',1,'2018-11-24 19:45:48'),('1','3','3',3,'2018-11-24 19:46:24'),('1','34','3',3,'2018-11-24 19:46:27'),('1','344','3',3,'2018-11-24 19:46:31'),('KTM Duke','KA05JR0005','Orange',13000,'2018-11-24 19:12:50'),('KTM Duke','KA05JR0050','Orange',13000,'2018-11-24 19:17:26'),('Karizma ZMR','KA41EC7781','Black',35401,'2018-11-24 19:10:14'),('Karizma ZMR','KA41ED6154','Black',25842,'2018-11-24 19:07:22');
/*!40000 ALTER TABLE `backup_bike_model` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `backup_bike_service`
--

DROP TABLE IF EXISTS `backup_bike_service`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `backup_bike_service` (
  `customer_name` varchar(50) DEFAULT NULL,
  `bike_name` varchar(45) DEFAULT NULL,
  `registration_no` varchar(45) NOT NULL,
  `repair_category` varchar(45) DEFAULT NULL,
  `customer_complaints` varchar(45) DEFAULT NULL,
  `timeStamp` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`registration_no`,`timeStamp`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `backup_bike_service`
--

LOCK TABLES `backup_bike_service` WRITE;
/*!40000 ALTER TABLE `backup_bike_service` DISABLE KEYS */;
INSERT INTO `backup_bike_service` VALUES ('Chirag Jagadish','KTM Duke','KA05JR0005','Service','Breaks','2018-11-24 19:13:36'),('Chirag Jagadish','KTM Duke','KA05JR0050','Service','Breaks','2018-11-24 19:17:38'),('Chirag Jagadish','KTM Duke','KA05JR0050','Service','Breaks','2018-11-24 19:17:48'),('Chirag Jagadish','KTM Duke','KA05JR0050','Service','Breaks','2018-11-24 19:17:51'),('Chirag Jagadish','KTM Duke','KA05JR0050','Service','Breaks','2018-11-24 19:17:53'),('Vivekananda Sai','Karizma ZMR','KA41EC7781','Service','Mileage + Pickup','2018-11-24 19:10:40'),('Abhishek K','Karizma ZMR','KA41ED6154','Service','Mileage','2018-11-24 19:07:56');
/*!40000 ALTER TABLE `backup_bike_service` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `backup_bill_quotation`
--

DROP TABLE IF EXISTS `backup_bill_quotation`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `backup_bill_quotation` (
  `registration_no` varchar(50) NOT NULL,
  `cost` int(11) NOT NULL,
  `cost_for` varchar(45) NOT NULL,
  `timeStamp` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`registration_no`,`cost`,`cost_for`,`timeStamp`),
  KEY `co_idx` (`cost`),
  KEY `cf_idx` (`cost_for`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `backup_bill_quotation`
--

LOCK TABLES `backup_bill_quotation` WRITE;
/*!40000 ALTER TABLE `backup_bill_quotation` DISABLE KEYS */;
INSERT INTO `backup_bill_quotation` VALUES ('KA41ED6154',40,'Additional screws','2018-11-24 19:09:02'),('KA05JR0005',200,'Labour Charge','2018-11-24 19:14:01'),('KA41EC7781',200,'Labour Charge','2018-11-24 19:11:43'),('KA41ED6154',200,'Labour Charge','2018-11-24 19:11:49'),('KA41EC7781',380,'Engine Oil','2018-11-24 19:11:20'),('KA41ED6154',380,'Engine Oil','2018-11-24 19:08:08'),('KA41ED6154',650,'Air Filter','2018-11-24 19:09:43'),('KA05JR0005',850,'Engine Oil','2018-11-24 19:14:14'),('KA41EC7781',3000,'Chain Spracket','2018-11-24 19:11:06'),('KA05JR0005',4250,'Break pads','2018-11-24 19:15:24');
/*!40000 ALTER TABLE `backup_bill_quotation` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `bike_model`
--

DROP TABLE IF EXISTS `bike_model`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `bike_model` (
  `bike_name` varchar(20) DEFAULT NULL,
  `registration_no` varchar(10) NOT NULL,
  `bike_color` varchar(45) DEFAULT NULL,
  `kilometers_run` int(11) DEFAULT NULL,
  PRIMARY KEY (`registration_no`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `bike_model`
--

LOCK TABLES `bike_model` WRITE;
/*!40000 ALTER TABLE `bike_model` DISABLE KEYS */;
INSERT INTO `bike_model` VALUES ('KTM Duke','KA05JR0005','Orange',13000),('Karizma ZMR','KA41EC7781','Black',35401),('Karizma ZMR','KA41ED6154','Black',25842);
/*!40000 ALTER TABLE `bike_model` ENABLE KEYS */;
UNLOCK TABLES;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'STRICT_TRANS_TABLES,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
/*!50003 CREATE*/ /*!50017 DEFINER=`root`@`localhost`*/ /*!50003 TRIGGER `bike_model_AFTER_INSERT` AFTER INSERT ON `bike_model` FOR EACH ROW BEGIN
	insert into backup_bike_model values(new.bike_name, new.registration_no, new.bike_color,
    new.kilometers_run, now());
END */;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;

--
-- Table structure for table `bill_quotation`
--

DROP TABLE IF EXISTS `bill_quotation`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `bill_quotation` (
  `registration_no` varchar(50) NOT NULL,
  `cost` int(11) NOT NULL,
  `cost_for` varchar(50) NOT NULL,
  PRIMARY KEY (`cost`,`cost_for`,`registration_no`),
  KEY `registration_no_idx` (`registration_no`),
  CONSTRAINT `reg_no` FOREIGN KEY (`registration_no`) REFERENCES `service` (`registration_no`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `bill_quotation`
--

LOCK TABLES `bill_quotation` WRITE;
/*!40000 ALTER TABLE `bill_quotation` DISABLE KEYS */;
INSERT INTO `bill_quotation` VALUES ('KA05JR0005',200,'Labour Charge'),('KA05JR0005',850,'Engine Oil'),('KA05JR0005',4250,'Break pads'),('KA41EC7781',200,'Labour Charge'),('KA41EC7781',380,'Engine Oil'),('KA41EC7781',3000,'Chain Spracket'),('KA41ED6154',40,'Additional screws'),('KA41ED6154',200,'Labour Charge'),('KA41ED6154',380,'Engine Oil'),('KA41ED6154',650,'Air Filter');
/*!40000 ALTER TABLE `bill_quotation` ENABLE KEYS */;
UNLOCK TABLES;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'STRICT_TRANS_TABLES,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
/*!50003 CREATE*/ /*!50017 DEFINER=`root`@`localhost`*/ /*!50003 TRIGGER `bill_quotation_AFTER_INSERT` AFTER INSERT ON `bill_quotation` FOR EACH ROW BEGIN
	insert into backup_bill_quotation values(
		new.registration_no, new.cost, new.cost_for, now()
    );
END */;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'STRICT_TRANS_TABLES,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
/*!50003 CREATE*/ /*!50017 DEFINER=`root`@`localhost`*/ /*!50003 TRIGGER `bill_quotation_AFTER_UPDATE` AFTER UPDATE ON `bill_quotation` FOR EACH ROW BEGIN
	insert into backup_bill_quotation values(
		new.registration_no, new.cost, new.cost_for, now()
    );
END */;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;

--
-- Table structure for table `service`
--

DROP TABLE IF EXISTS `service`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `service` (
  `customer_name` char(20) DEFAULT NULL,
  `bike_name` varchar(20) DEFAULT NULL,
  `registration_no` varchar(10) NOT NULL,
  `repair_category` varchar(20) DEFAULT NULL,
  `customer_complaints` varchar(45) DEFAULT NULL,
  `time_stamp` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`registration_no`,`time_stamp`),
  CONSTRAINT `bike_reg_no` FOREIGN KEY (`registration_no`) REFERENCES `bike_model` (`registration_no`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `service`
--

LOCK TABLES `service` WRITE;
/*!40000 ALTER TABLE `service` DISABLE KEYS */;
INSERT INTO `service` VALUES ('Chirag Jagadish','KTM Duke','KA05JR0005','Service','Breaks','2018-11-24 19:13:36'),('Vivekananda Sai','Karizma ZMR','KA41EC7781','Service','Mileage + Pickup','2018-11-24 19:10:40'),('Abhishek K','Karizma ZMR','KA41ED6154','Service','Mileage','2018-11-24 19:07:56');
/*!40000 ALTER TABLE `service` ENABLE KEYS */;
UNLOCK TABLES;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'STRICT_TRANS_TABLES,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
/*!50003 CREATE*/ /*!50017 DEFINER=`root`@`localhost`*/ /*!50003 TRIGGER `service_AFTER_INSERT` AFTER INSERT ON `service` FOR EACH ROW BEGIN
	delete from bill_quotation where registration_no = new.registration_no;
    insert into backup_bike_service values(new.customer_name, new.bike_name, 
		new.registration_no, new.repair_category, new.customer_complaints, now());
END */;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;

--
-- Dumping events for database 'bike_service'
--

--
-- Dumping routines for database 'bike_service'
--
/*!50003 DROP PROCEDURE IF EXISTS `allVehicleSummary` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'STRICT_TRANS_TABLES,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `allVehicleSummary`()
BEGIN
	select distinct
    s.customer_name, s.bike_name, bm.bike_color, bm.registration_no, s.time_stamp
    from service s, bike_model bm
    where s.registration_no = bm.registration_no
	order by s.customer_name;
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `bill` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'STRICT_TRANS_TABLES,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `bill`()
BEGIN
	select distinct
    s.bike_name, s.repair_category, b.cost, b.registration_no 
    from service s, bill_quotation b
    where s.registration_no = b.registration_no;
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `bill_quotation` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'STRICT_TRANS_TABLES,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `bill_quotation`()
BEGIN
	select * from bill_quotation order by registration_no desc;
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `delete_bike_model` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'STRICT_TRANS_TABLES,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `delete_bike_model`(reg_no varchar(45))
BEGIN
	delete from bike_model where registration_no = reg_no;
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `delete_quotation_proc` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'STRICT_TRANS_TABLES,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `delete_quotation_proc`(reg varchar(50), old_cost int, 
																	old_costfor varchar(50))
BEGIN
	delete from bill_quotation
    where registration_no = reg 
    and cost = old_cost
    and cost_for = old_costfor;
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `models` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'STRICT_TRANS_TABLES,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `models`()
BEGIN
	select registration_no from bike_model;
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `update_quotation_proc` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'STRICT_TRANS_TABLES,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `update_quotation_proc`(reg varchar(50), 
										old_cost int, old_costfor varchar(50), new_cost int)
BEGIN
	update bill_quotation
		set cost = new_cost
        where registration_no = reg
        and cost = old_cost
        and cost_for = old_costfor;
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `vehicleSummary` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'STRICT_TRANS_TABLES,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `vehicleSummary`(reg_no varchar(10))
BEGIN
	select s.customer_name, s.bike_name, bm.bike_color, bm.registration_no,
    bm.kilometers_run, s.repair_category, s.customer_complaints
    from service s, bike_model bm
    where s.registration_no = bm.registration_no
    and s.registration_no = reg_no
    and bm.registration_no = reg_no;   
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2018-11-24 20:26:41
