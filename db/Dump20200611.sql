CREATE DATABASE  IF NOT EXISTS `boletos` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `boletos`;
-- MySQL dump 10.13  Distrib 8.0.17, for Win64 (x86_64)
--
-- Host: localhost    Database: boletos
-- ------------------------------------------------------
-- Server version	8.0.17

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `controleboletos`
--

DROP TABLE IF EXISTS `controleboletos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `controleboletos` (
  `cod_boleto` int(11) NOT NULL AUTO_INCREMENT,
  `dt_emissãoNF` date DEFAULT NULL,
  `dt_emissãoBT` date NOT NULL,
  `dt_operacao` date DEFAULT NULL,
  `cliente` varchar(60) NOT NULL,
  `nf_boleto` varchar(7) DEFAULT NULL,
  `banco` varchar(50) NOT NULL,
  `valor_Boleto` double NOT NULL,
  `dt_vencimento` date NOT NULL,
  `dt_pagamento` date DEFAULT NULL,
  `status_Doc` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`cod_boleto`)
) ENGINE=InnoDB AUTO_INCREMENT=28 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `controleboletos`
--

LOCK TABLES `controleboletos` WRITE;
/*!40000 ALTER TABLE `controleboletos` DISABLE KEYS */;
INSERT INTO `controleboletos` VALUES (23,'2020-07-02','2020-06-24','2020-06-25','MARCOS ANTONIO','33333','Daycoval',33333,'2020-06-17','2020-06-24','Simples'),(24,'2020-06-26','2020-06-17','2020-06-20','Maria','45566','Santander',5644,'2020-06-19',NULL,'Descontado');
/*!40000 ALTER TABLE `controleboletos` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping events for database 'boletos'
--

--
-- Dumping routines for database 'boletos'
--
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2020-06-11 12:40:06
