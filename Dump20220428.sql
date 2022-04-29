CREATE DATABASE  IF NOT EXISTS `systemtournament` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `systemtournament`;
-- MySQL dump 10.13  Distrib 8.0.28, for Win64 (x86_64)
--
-- Host: localhost    Database: systemtournament
-- ------------------------------------------------------
-- Server version	8.0.28

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
-- Table structure for table `player`
--

DROP TABLE IF EXISTS `player`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `player` (
  `id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=41 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `player`
--

LOCK TABLES `player` WRITE;
/*!40000 ALTER TABLE `player` DISABLE KEYS */;
INSERT INTO `player` VALUES (1,'Chris'),(2,'Aleks'),(3,'Pelle'),(4,'Nick'),(5,'Jesper'),(6,'Tobias'),(7,'Tess'),(8,'Maria'),(9,'Lucas'),(10,'Iris'),(11,'Louise'),(12,'Mikkel'),(13,'Cecilie'),(14,'Mark'),(15,'Kevin'),(16,'Loki'),(17,'Thor'),(18,'Karsten'),(19,'Lilian'),(20,'Vivien'),(21,'Albert'),(22,'Carl'),(23,'Oliver'),(24,'Natasja'),(25,'Simone'),(26,'Lau'),(27,'Nicklas'),(28,'Jannick'),(29,'Tony'),(30,'Mie'),(31,'Ahmet'),(32,'Bo'),(33,'Laerke'),(34,'Jeppe'),(35,'Simon'),(36,'Heidi'),(37,'Benny'),(38,'Olga'),(39,'Kristina'),(40,'Isidora');
/*!40000 ALTER TABLE `player` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `team`
--

DROP TABLE IF EXISTS `team`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `team` (
  `id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(45) DEFAULT NULL,
  `score` int DEFAULT NULL,
  `points` int DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=21 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `team`
--

LOCK TABLES `team` WRITE;
/*!40000 ALTER TABLE `team` DISABLE KEYS */;
INSERT INTO `team` VALUES (13,'Raptors',0,0),(14,'Suns',0,0),(15,'Bulls',0,0),(16,'Miami',0,0),(17,'Clippers',0,0),(18,'Bucks',0,0),(19,'Los Angeles',0,0),(20,'Denver',0,0);
/*!40000 ALTER TABLE `team` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `team_player`
--

DROP TABLE IF EXISTS `team_player`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `team_player` (
  `playerID` int DEFAULT NULL,
  `teamID` int DEFAULT NULL,
  KEY `playerID_idx` (`playerID`),
  KEY `teamID_idx` (`teamID`),
  CONSTRAINT `playerID` FOREIGN KEY (`playerID`) REFERENCES `player` (`id`),
  CONSTRAINT `teamID` FOREIGN KEY (`teamID`) REFERENCES `team` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `team_player`
--

LOCK TABLES `team_player` WRITE;
/*!40000 ALTER TABLE `team_player` DISABLE KEYS */;
INSERT INTO `team_player` VALUES (1,17),(2,13),(3,14),(4,13),(5,13),(6,14),(7,14),(8,14),(9,14),(10,14),(11,15),(12,15),(13,15),(14,15),(15,15),(16,16),(17,16),(18,16),(19,16),(20,16),(21,17),(22,17),(23,17),(24,17),(25,17),(26,18),(27,18),(28,18),(29,18),(30,18),(31,19),(32,19),(33,19),(34,19),(35,19),(36,20),(37,20),(38,20),(39,20),(40,20);
/*!40000 ALTER TABLE `team_player` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-04-28 11:15:53
