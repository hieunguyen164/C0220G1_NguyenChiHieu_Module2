-- MySQL dump 10.13  Distrib 8.0.19, for Win64 (x86_64)
--
-- Host: localhost    Database: quanlythuvien
-- ------------------------------------------------------
-- Server version	8.0.19

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
-- Table structure for table `chitietphieumuon`
--

DROP TABLE IF EXISTS `chitietphieumuon`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `chitietphieumuon` (
  `idChiTietPhieuMuon` int NOT NULL AUTO_INCREMENT,
  `idPhieuMuon` int DEFAULT NULL,
  `idSach` int DEFAULT NULL,
  `soLuong` int DEFAULT NULL,
  PRIMARY KEY (`idChiTietPhieuMuon`),
  KEY `idPhieuMuon` (`idPhieuMuon`),
  KEY `idSach` (`idSach`),
  CONSTRAINT `chitietphieumuon_ibfk_1` FOREIGN KEY (`idPhieuMuon`) REFERENCES `phieumuon` (`idPhieuMuon`),
  CONSTRAINT `chitietphieumuon_ibfk_2` FOREIGN KEY (`idSach`) REFERENCES `sach` (`idSach`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `chitietphieumuon`
--

LOCK TABLES `chitietphieumuon` WRITE;
/*!40000 ALTER TABLE `chitietphieumuon` DISABLE KEYS */;
INSERT INTO `chitietphieumuon` VALUES (1,1,1,1),(2,2,2,1),(3,3,3,1),(4,4,4,1),(5,5,5,1),(6,6,6,1),(7,7,7,1);
/*!40000 ALTER TABLE `chitietphieumuon` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `loaisach`
--

DROP TABLE IF EXISTS `loaisach`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `loaisach` (
  `idLoaiSach` int NOT NULL AUTO_INCREMENT,
  `tenLoaiSach` varchar(45) NOT NULL,
  PRIMARY KEY (`idLoaiSach`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `loaisach`
--

LOCK TABLES `loaisach` WRITE;
/*!40000 ALTER TABLE `loaisach` DISABLE KEYS */;
INSERT INTO `loaisach` VALUES (1,'sach lap trinh'),(2,'sach ngoai ngu'),(3,'sach van hoc'),(4,'sach lich su'),(5,'sach khoa hoc');
/*!40000 ALTER TABLE `loaisach` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `phieumuon`
--

DROP TABLE IF EXISTS `phieumuon`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `phieumuon` (
  `idPhieuMuon` int NOT NULL AUTO_INCREMENT,
  `ngayMuon` date NOT NULL,
  `ngayTra` date DEFAULT NULL,
  `tinhTrang` varchar(45) DEFAULT NULL,
  `idSinhVien` int DEFAULT NULL,
  PRIMARY KEY (`idPhieuMuon`),
  KEY `idSinhVien` (`idSinhVien`),
  CONSTRAINT `phieumuon_ibfk_1` FOREIGN KEY (`idSinhVien`) REFERENCES `sinhvien` (`idSinhVien`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `phieumuon`
--

LOCK TABLES `phieumuon` WRITE;
/*!40000 ALTER TABLE `phieumuon` DISABLE KEYS */;
INSERT INTO `phieumuon` VALUES (1,'2020-04-30',NULL,'chua tra',1),(2,'2020-04-29','2020-05-01','da tra',2),(3,'2020-04-28','2020-05-01','da tra',3),(4,'2020-04-27',NULL,'chua tra',4),(5,'2020-04-26',NULL,'chua tra',5),(6,'2020-04-25',NULL,'chua tra',6),(7,'2020-04-24',NULL,'chua tra',7);
/*!40000 ALTER TABLE `phieumuon` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `sach`
--

DROP TABLE IF EXISTS `sach`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `sach` (
  `idSach` int NOT NULL AUTO_INCREMENT,
  `tenSach` varchar(45) NOT NULL,
  `nhaXuanBan` varchar(45) NOT NULL,
  `tacGia` varchar(20) NOT NULL,
  `namXuanBan` year NOT NULL,
  `soLanXuatBan` int NOT NULL,
  `gia` double NOT NULL,
  `anh` blob,
  `idLoaiSach` int DEFAULT NULL,
  PRIMARY KEY (`idSach`),
  KEY `idLoaiSach` (`idLoaiSach`),
  CONSTRAINT `sach_ibfk_1` FOREIGN KEY (`idLoaiSach`) REFERENCES `loaisach` (`idLoaiSach`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `sach`
--

LOCK TABLES `sach` WRITE;
/*!40000 ALTER TABLE `sach` DISABLE KEYS */;
INSERT INTO `sach` VALUES (1,'book1','abc','bcd',1991,10,100000,_binary '?',1),(2,'book2','abc','bcd',1991,10,100000,_binary '?',2),(3,'book3','abc','bcd',1991,10,100000,_binary '?',3),(4,'book4','abc','bcd',1991,10,100000,_binary '?',4),(5,'book5','abc','bcd',1991,10,100000,_binary '?',5),(6,'book6','abc','bcd',1991,10,100000,_binary '?',1),(7,'book7','abc','bcd',1991,10,100000,_binary '?',2),(8,'book8','abc','bcd',1991,10,100000,_binary '?',3),(9,'book9','abc','bcd',1991,10,100000,_binary '?',4),(10,'book10','abc','bcd',1991,10,100000,_binary '?',5);
/*!40000 ALTER TABLE `sach` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `sinhvien`
--

DROP TABLE IF EXISTS `sinhvien`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `sinhvien` (
  `idSinhVien` int NOT NULL AUTO_INCREMENT,
  `tenSinhVien` varchar(45) NOT NULL,
  `ngaySinh` date NOT NULL,
  `diaChi` varchar(45) NOT NULL,
  `email` varchar(45) NOT NULL,
  `soDienThoai` varchar(45) NOT NULL,
  `anh` blob,
  PRIMARY KEY (`idSinhVien`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `sinhvien`
--

LOCK TABLES `sinhvien` WRITE;
/*!40000 ALTER TABLE `sinhvien` DISABLE KEYS */;
INSERT INTO `sinhvien` VALUES (1,'Nguyen A','1991-04-30','da nang','na@gmail.com','123123123',NULL),(2,'Nguyen B','1991-04-30','da nang','na@gmail.com','123123123',_binary '?'),(3,'Nguyen C','1991-04-30','da nang','na@gmail.com','123123123',_binary '?'),(4,'Nguyen D','1991-04-30','da nang','na@gmail.com','123123123',_binary '?'),(5,'Nguyen E','1991-04-30','da nang','na@gmail.com','123123123',_binary '?'),(6,'Nguyen F','1991-04-30','da nang','na@gmail.com','123123123',_binary '?'),(7,'Nguyen G','1991-04-30','da nang','na@gmail.com','123123123',_binary '?');
/*!40000 ALTER TABLE `sinhvien` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2020-05-03 15:05:04
