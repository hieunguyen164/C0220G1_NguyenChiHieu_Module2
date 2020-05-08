-- MySQL dump 10.13  Distrib 8.0.19, for Win64 (x86_64)
--
-- Host: localhost    Database: furamaresort
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
-- Table structure for table `bophan`
--

DROP TABLE IF EXISTS `bophan`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `bophan` (
  `idBoPhan` int NOT NULL AUTO_INCREMENT,
  `tenBoPhan` varchar(45) NOT NULL,
  PRIMARY KEY (`idBoPhan`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `bophan`
--

LOCK TABLES `bophan` WRITE;
/*!40000 ALTER TABLE `bophan` DISABLE KEYS */;
INSERT INTO `bophan` VALUES (1,'sale-marketing'),(2,'hanh chinh'),(3,'phuc vu'),(4,'quan ly');
/*!40000 ALTER TABLE `bophan` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `dichvu`
--

DROP TABLE IF EXISTS `dichvu`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `dichvu` (
  `idDichVu` int NOT NULL AUTO_INCREMENT,
  `tenDichVu` varchar(45) NOT NULL,
  `dienTich` double NOT NULL,
  `chiPhiThue` double NOT NULL,
  `soNguoiToiDa` int NOT NULL,
  `tieuChuanPhong` varchar(20) DEFAULT NULL,
  `moTaTienNghiKhac` varchar(255) DEFAULT NULL,
  `dienTichHoBoi` double DEFAULT NULL,
  `soTang` int DEFAULT NULL,
  `trangThai` varchar(45) DEFAULT NULL,
  `dichVuMienPhi` varchar(100) DEFAULT NULL,
  `idKieuThue` int NOT NULL,
  `idLoaiDichVu` int NOT NULL,
  PRIMARY KEY (`idDichVu`),
  KEY `idKieuThue` (`idKieuThue`),
  KEY `idLoaiDichVu` (`idLoaiDichVu`),
  CONSTRAINT `dichvu_ibfk_1` FOREIGN KEY (`idKieuThue`) REFERENCES `kieuthue` (`idKieuThue`),
  CONSTRAINT `dichvu_ibfk_2` FOREIGN KEY (`idLoaiDichVu`) REFERENCES `loaidichvu` (`idLoaiDichVu`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `dichvu`
--

LOCK TABLES `dichvu` WRITE;
/*!40000 ALTER TABLE `dichvu` DISABLE KEYS */;
INSERT INTO `dichvu` VALUES (1,'villa1',100,3500000,8,'deluxe','ho boi',20,3,NULL,NULL,2,1),(2,'villa2',100,3000000,8,'superior','ho boi',20,3,NULL,NULL,2,1),(3,'villa3',100,2500000,8,'standard','ho boi',20,3,NULL,NULL,2,1),(4,'house1',50,2000000,4,'deluxe','ban cong',NULL,2,NULL,NULL,3,2),(5,'house2',50,1500000,4,'superior','ban cong',NULL,2,NULL,NULL,3,2),(6,'house3',50,1000000,4,'standard','ban cong',NULL,2,NULL,NULL,3,2),(7,'room1',30,700000,2,'',NULL,NULL,NULL,NULL,'wifi',4,3),(8,'room2',30,700000,2,'',NULL,NULL,NULL,NULL,'wifi',4,3),(9,'room3',30,700000,2,'',NULL,NULL,NULL,NULL,'wifi',4,3);
/*!40000 ALTER TABLE `dichvu` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `dichvudikem`
--

DROP TABLE IF EXISTS `dichvudikem`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `dichvudikem` (
  `idDichVuDiKem` int NOT NULL AUTO_INCREMENT,
  `tenDichVuDiKem` varchar(45) NOT NULL,
  `gia` double NOT NULL,
  `donVi` varchar(20) NOT NULL,
  `trangThaiKhaDung` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`idDichVuDiKem`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `dichvudikem`
--

LOCK TABLES `dichvudikem` WRITE;
/*!40000 ALTER TABLE `dichvudikem` DISABLE KEYS */;
INSERT INTO `dichvudikem` VALUES (1,'massage',300000,'gio',NULL),(2,'karaoke',200000,'gio',NULL),(3,'thuc an',100000,'suat',NULL),(4,'nuoc uong',50000,'suat',NULL),(5,'thue xe',1000000,'chuyen',NULL);
/*!40000 ALTER TABLE `dichvudikem` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `hopdong`
--

DROP TABLE IF EXISTS `hopdong`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `hopdong` (
  `idHopDong` int NOT NULL AUTO_INCREMENT,
  `ngayLamHopDong` date NOT NULL,
  `ngayKetThuc` date DEFAULT NULL,
  `tienDatCoc` double DEFAULT NULL,
  `tongTien` double DEFAULT NULL,
  `idNhanVien` int DEFAULT NULL,
  `idKhachHang` int DEFAULT NULL,
  `idDichVu` int DEFAULT NULL,
  PRIMARY KEY (`idHopDong`),
  KEY `idNhanVien` (`idNhanVien`),
  KEY `idKhachHang` (`idKhachHang`),
  KEY `idDichVu` (`idDichVu`),
  CONSTRAINT `hopdong_ibfk_1` FOREIGN KEY (`idNhanVien`) REFERENCES `nhanvien` (`idNhanVien`),
  CONSTRAINT `hopdong_ibfk_2` FOREIGN KEY (`idKhachHang`) REFERENCES `khachhang` (`idKhachHang`),
  CONSTRAINT `hopdong_ibfk_3` FOREIGN KEY (`idDichVu`) REFERENCES `dichvu` (`idDichVu`)
) ENGINE=InnoDB AUTO_INCREMENT=30 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `hopdong`
--

LOCK TABLES `hopdong` WRITE;
/*!40000 ALTER TABLE `hopdong` DISABLE KEYS */;
INSERT INTO `hopdong` VALUES (1,'2018-01-16','2018-02-15',200000,NULL,4,1,1),(2,'2018-02-16','2018-03-15',200000,NULL,4,1,2),(3,'2018-03-16','2018-04-15',200000,NULL,9,1,3),(4,'2018-04-16','2018-05-15',200000,NULL,9,1,1),(5,'2018-05-16','2018-06-15',200000,NULL,11,1,2),(6,'2018-06-16','2018-06-17',200000,NULL,11,7,4),(7,'2018-07-16','2018-07-17',200000,NULL,16,7,5),(8,'2018-08-16','2018-08-17',200000,NULL,16,8,1),(9,'2019-01-16','2019-01-17',200000,NULL,4,8,5),(10,'2019-02-16','2019-02-17',200000,NULL,9,8,6),(11,'2019-01-20','2019-02-19',200000,NULL,11,9,3),(12,'2019-02-05','2019-03-04',200000,NULL,16,2,3),(13,'2019-03-10','2019-03-11',200000,NULL,9,3,4),(14,'2019-01-11','2019-01-12',200000,NULL,11,4,5),(15,'2019-02-21','2019-02-22',200000,NULL,16,10,6),(16,'2019-03-16','2019-04-15',200000,NULL,9,21,4),(17,'2019-04-16','2019-05-15',200000,NULL,11,21,5),(18,'2019-05-16','2019-06-15',200000,NULL,16,22,3),(19,'2019-06-16','2019-07-15',200000,NULL,9,23,4),(20,'2019-07-16','2019-08-15',200000,NULL,11,23,3),(21,'2019-08-16','2019-08-17',200000,NULL,16,23,4),(22,'2019-09-16','2019-10-15',200000,NULL,9,24,6),(23,'2019-10-16','2019-11-15',200000,NULL,11,24,1),(24,'2019-11-16','2019-11-17',200000,NULL,16,24,2),(25,'2019-12-16','2019-12-17',200000,NULL,9,24,5),(27,'2015-01-01','2015-01-10',200000,NULL,11,11,6),(28,'2015-02-01','2015-02-10',200000,NULL,16,12,5),(29,'2019-12-20','2019-12-29',200000,NULL,9,24,6);
/*!40000 ALTER TABLE `hopdong` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `hopdongchitiet`
--

DROP TABLE IF EXISTS `hopdongchitiet`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `hopdongchitiet` (
  `idHopDongChiTiet` int NOT NULL AUTO_INCREMENT,
  `soLuong` int DEFAULT NULL,
  `idHopDong` int DEFAULT NULL,
  `idDichVuDiKem` int DEFAULT NULL,
  PRIMARY KEY (`idHopDongChiTiet`),
  KEY `idHopDong` (`idHopDong`),
  KEY `idDichVuDiKem` (`idDichVuDiKem`),
  CONSTRAINT `hopdongchitiet_ibfk_1` FOREIGN KEY (`idHopDong`) REFERENCES `hopdong` (`idHopDong`),
  CONSTRAINT `hopdongchitiet_ibfk_2` FOREIGN KEY (`idDichVuDiKem`) REFERENCES `dichvudikem` (`idDichVuDiKem`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `hopdongchitiet`
--

LOCK TABLES `hopdongchitiet` WRITE;
/*!40000 ALTER TABLE `hopdongchitiet` DISABLE KEYS */;
INSERT INTO `hopdongchitiet` VALUES (1,2,1,1),(2,1,1,2),(3,3,8,3),(4,1,11,4),(5,1,12,4),(7,3,13,2),(8,1,14,3),(9,2,15,4),(10,1,16,5);
/*!40000 ALTER TABLE `hopdongchitiet` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `khachhang`
--

DROP TABLE IF EXISTS `khachhang`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `khachhang` (
  `idKhachHang` int NOT NULL AUTO_INCREMENT,
  `ho` varchar(20) NOT NULL,
  `ten` varchar(45) NOT NULL,
  `hoten` varchar(50) DEFAULT NULL,
  `ngaySinh` date NOT NULL,
  `gioiTinh` varchar(10) NOT NULL,
  `soCMND` varchar(20) NOT NULL,
  `soDienThoai` varchar(20) NOT NULL,
  `email` varchar(45) NOT NULL,
  `diaChi` varchar(100) NOT NULL,
  `idLoaiKhach` int DEFAULT NULL,
  PRIMARY KEY (`idKhachHang`),
  KEY `idLoaiKhach` (`idLoaiKhach`),
  CONSTRAINT `khachhang_ibfk_1` FOREIGN KEY (`idLoaiKhach`) REFERENCES `loaikhach` (`idLoaiKhach`)
) ENGINE=InnoDB AUTO_INCREMENT=28 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `khachhang`
--

LOCK TABLES `khachhang` WRITE;
/*!40000 ALTER TABLE `khachhang` DISABLE KEYS */;
INSERT INTO `khachhang` VALUES (1,'Nguyen Van','Dui','Nguyen Van Dui','1989-12-20','nam','112345463','093785439','nguyenvan@gmail.com','vinh',1),(2,'Pham Tan','Tam','Pham Tan Tam','1991-12-20','nu','112345463','093785439','phamtam@gmail.com','ha noi',2),(3,'Le Ngoc','Hoang','Le Ngoc Hoang','1981-12-20','nam','112345463','093785439','lehoang@gmail.com','quang nam',3),(4,'Tran Khac','Chan','Tran Khac Chan','1990-12-20','nam','112345463','093785439','tranchan@gmail.com','quang tri',4),(5,'Nguyen Huu','Phuoc','Nguyen Huu Phuoc','1950-12-20','nam','112345463','093785439','nguyenphuoc@gmail.com','da nang',5),(6,'Pham Duc','Toan','Pham Duc Toan','2008-01-12','nam','112345463','093785439','phamtoan@gmail.com','da nang',1),(7,'Le Khac','Hieu','Le Khac Hieu','1995-12-20','nam','112345463','093785439','lehieu@gmail.com','hue',2),(8,'Tran Dai','Dang','Tran Dai Dang','1993-12-20','nam','112345463','093785439','trandang@gmail.com','can tho',3),(9,'Nguyen Thi','Thuy','Nguyen Thi Thuy','1991-12-20','nu','112345463','093785439','nguyenthuy@gmail.com','hai phong',4),(10,'Pham Hoang','Dung','Pham Hoang Dung','1968-12-20','nu','112345463','093785439','phamdung@gmail.com','quang tri',5),(11,'Le','Nhan','Le Nhan','1991-12-20','nam','112345463','093785439','lenhan@gmail.com','quang tri',1),(12,'Tran','Thien','Tran Thien','1998-12-20','nam','112345463','093785439','tranthien@gmail.com','da nang',2),(13,'Nguyen','Thuyen','Nguyen Thuyen','2005-12-20','nu','112345463','093785439','nguyenthuyen@gmail.com','da nang',3),(14,'Pham','Trung','Pham Trung','1997-12-20','nam','112345463','093785439','phamtrung@gmail.com','hung yen',4),(15,'Le','Diem','Le Diem','1991-12-20','nu','112345463','093785439','lediem@gmail.com','da nang',5),(16,'Tran','Doan','Tran Doan','2000-12-20','nam','112345463','093785439','trandoan@gmail.com','quang tri',1),(17,'Nguyen','Tuyet','Nguyen Tuyet','1971-12-20','nu','112345463','093785439','nguyentuyet@gmail.com','da nang',2),(18,'Pham','Anh','Pham Anh','1987-12-20','nu','112345463','093785439','phamanh@gmail.com','quang tri',3),(19,'Le','Nhung','Le Nhung','1991-12-20','nu','112345463','093785439','lenhung@gmail.com','da nang',4),(20,'Tran','Vy','Tran Vy','2005-12-20','nam','112345463','093785439','tranvy@gmail.com','ca mau',5),(21,'Nguyen Duc','Kha','Nguyen Duc Kha','1989-12-20','nam','112345463','093785439','nguyenkha@gmail.com','quang ngai',1),(22,'Pham Van','Toan','Pham Van Toan','1989-12-20','nam','112345463','093785439','phamtoan@gmail.com','quang binh',1),(23,'Le Huu','Dat','Le Huu Dat','1989-12-20','nam','112345463','093785439','ledat@gmail.com','bac lieu',1),(24,'Tran Hoan','Nam','Tran Hoan Nam','1989-12-20','nam','112345463','093785439','trannam@gmail.com','quang ngai',1),(25,'Le Thanh','Danh','Le Thanh Danh','1989-12-20','nu','112345463','093785439','ledanh@gmail.com','ha noi',1),(26,'Le Thanh','Danh','Le Thanh Danh','1989-12-20','nu','112345463','093785439','ledanh@gmail.com','ha noi',1),(27,'Le Thanh','Danh','Le Thanh Danh','1989-12-20','nu','112345463','093785439','ledanh@gmail.com','ha noi',1);
/*!40000 ALTER TABLE `khachhang` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `kieuthue`
--

DROP TABLE IF EXISTS `kieuthue`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `kieuthue` (
  `idKieuThue` int NOT NULL AUTO_INCREMENT,
  `tenKieuThue` varchar(45) NOT NULL,
  `gia` double DEFAULT NULL,
  PRIMARY KEY (`idKieuThue`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `kieuthue`
--

LOCK TABLES `kieuthue` WRITE;
/*!40000 ALTER TABLE `kieuthue` DISABLE KEYS */;
INSERT INTO `kieuthue` VALUES (1,'nam',NULL),(2,'thang',NULL),(3,'ngay',NULL),(4,'gio',NULL);
/*!40000 ALTER TABLE `kieuthue` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `loaidichvu`
--

DROP TABLE IF EXISTS `loaidichvu`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `loaidichvu` (
  `idLoaiDichVu` int NOT NULL AUTO_INCREMENT,
  `tenLoaiDichVu` varchar(45) NOT NULL,
  PRIMARY KEY (`idLoaiDichVu`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `loaidichvu`
--

LOCK TABLES `loaidichvu` WRITE;
/*!40000 ALTER TABLE `loaidichvu` DISABLE KEYS */;
INSERT INTO `loaidichvu` VALUES (1,'villa'),(2,'house'),(3,'room');
/*!40000 ALTER TABLE `loaidichvu` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `loaikhach`
--

DROP TABLE IF EXISTS `loaikhach`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `loaikhach` (
  `idLoaiKhach` int NOT NULL AUTO_INCREMENT,
  `tenLoaiKhach` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`idLoaiKhach`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `loaikhach`
--

LOCK TABLES `loaikhach` WRITE;
/*!40000 ALTER TABLE `loaikhach` DISABLE KEYS */;
INSERT INTO `loaikhach` VALUES (1,'diamond'),(2,'platinum'),(3,'gold'),(4,'silver'),(5,'member');
/*!40000 ALTER TABLE `loaikhach` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `months`
--

DROP TABLE IF EXISTS `months`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `months` (
  `month` int NOT NULL,
  PRIMARY KEY (`month`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `months`
--

LOCK TABLES `months` WRITE;
/*!40000 ALTER TABLE `months` DISABLE KEYS */;
INSERT INTO `months` VALUES (1),(2),(3),(4),(5),(6),(7),(8),(9),(10),(11),(12);
/*!40000 ALTER TABLE `months` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `nhanvien`
--

DROP TABLE IF EXISTS `nhanvien`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `nhanvien` (
  `idNhanVien` int NOT NULL AUTO_INCREMENT,
  `ho` varchar(20) NOT NULL,
  `ten` varchar(45) NOT NULL,
  `hoten` varchar(50) DEFAULT NULL,
  `ngaySinh` date NOT NULL,
  `soCMND` varchar(20) NOT NULL,
  `soDienThoai` varchar(20) NOT NULL,
  `email` varchar(45) NOT NULL,
  `diaChi` varchar(100) NOT NULL,
  `luong` double NOT NULL,
  `idViTri` int DEFAULT NULL,
  `idTrinhDo` int DEFAULT NULL,
  `idBoPhan` int DEFAULT NULL,
  PRIMARY KEY (`idNhanVien`),
  KEY `idViTri` (`idViTri`),
  KEY `idTrinhDo` (`idTrinhDo`),
  KEY `idBoPhan` (`idBoPhan`),
  CONSTRAINT `nhanvien_ibfk_1` FOREIGN KEY (`idViTri`) REFERENCES `vitri` (`idViTri`),
  CONSTRAINT `nhanvien_ibfk_2` FOREIGN KEY (`idTrinhDo`) REFERENCES `trinhdo` (`idTrinhDo`),
  CONSTRAINT `nhanvien_ibfk_3` FOREIGN KEY (`idBoPhan`) REFERENCES `bophan` (`idBoPhan`)
) ENGINE=InnoDB AUTO_INCREMENT=21 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `nhanvien`
--

LOCK TABLES `nhanvien` WRITE;
/*!40000 ALTER TABLE `nhanvien` DISABLE KEYS */;
INSERT INTO `nhanvien` VALUES (1,'Nguyen Chi','Hieu','Nguyen Chi Hieu','1991-04-16','123456789','0923482412','hieunguyen@gmai.com','da nang',5000000,1,1,3),(2,'Tran','Van','Tran Van','1991-04-16','123456789','0923482412','tranvan@gmai.com','hue',5000000,2,2,3),(3,'Pham','Thao','Pham Thao','1991-04-16','123456789','0923482412','phamthao@gmai.com','ha noi',10000000,3,3,2),(4,'Le','Quy','Le Quy','1991-04-16','123456789','0923482412','lequyn@gmai.com','ho chi minh',15000000,4,3,1),(5,'Nguyen','Nam','Nguyen Nam','1991-04-16','123456789','0923482412','nguyenam@gmai.com','da nang',20000000,5,3,2),(6,'Tran','Huy','Tran Huy','1991-04-16','123456789','0923482412','tranhuy@gmai.com','quang tri',50000000,6,4,4),(7,'Pham','Tien','Pham Tien','1991-04-16','123456789','0923482412','phamtien@gmai.com','quang ngai',5000000,1,1,3),(8,'Le','Hai','Le Hai','1991-04-16','123456789','0923482412','lehai@gmai.com','quang tri',5000000,2,2,3),(9,'Nguyen','Bac','Nguyen Bac','1991-04-16','123456789','0923482412','nguyenbac@gmai.com','da nang',10000000,3,3,1),(10,'Tran','Tuyen','Tran Tuyen','1991-04-16','123456789','0923482412','trantuyen@gmai.com','quang tri',15000000,4,3,2),(11,'Pham','Cong','Pham Cong','1991-04-16','123456789','0923482412','phamcong@gmai.com','da nang',20000000,5,3,1),(12,'Le','Dao','Le Dao','1991-04-16','123456789','0923482412','ledao@gmai.com','da nang',50000000,6,4,4),(13,'Nguyen','Toan','Nguyen Toan','1991-04-16','123456789','0923482412','nguyentoan@gmai.com','ha noi',5000000,1,1,3),(14,'Tran','Hoan','Tran Hoan','1991-04-16','123456789','0923482412','tranhoan@gmai.com','quang tri',5000000,2,2,3),(15,'Pham','Khanh','Pham Khanh','1991-04-16','123456789','0923482412','phamkhanh@gmai.com','quang tri',10000000,3,3,2),(16,'Le','Khai','Le Khai','1991-04-16','123456789','0923482412','lekhai@gmai.com','hai phong',15000000,4,3,1),(17,'Nguyen','Tung','Nguyen Tung','1991-04-16','123456789','0923482412','nguyentung@gmai.com','quang tri',20000000,5,3,2),(18,'Tran','Kim','Tran Kim','1991-04-16','123456789','0923482412','trankim@gmai.com','quang tri',50000000,6,4,4),(19,'Pham','Vy','Pham Vy','1991-04-16','123456789','0923482412','phamvy@gmai.com','da nang',5000000,1,1,3),(20,'Le','Dung','Le Dung','1991-04-16','123456789','0923482412','ledung@gmai.com','da nang',5000000,2,2,3);
/*!40000 ALTER TABLE `nhanvien` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `trinhdo`
--

DROP TABLE IF EXISTS `trinhdo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `trinhdo` (
  `idTrinhDo` int NOT NULL AUTO_INCREMENT,
  `tenTrinhDo` varchar(45) NOT NULL,
  PRIMARY KEY (`idTrinhDo`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `trinhdo`
--

LOCK TABLES `trinhdo` WRITE;
/*!40000 ALTER TABLE `trinhdo` DISABLE KEYS */;
INSERT INTO `trinhdo` VALUES (1,'trung cap'),(2,'cao dang'),(3,'dai hoc'),(4,'sau dai hoc');
/*!40000 ALTER TABLE `trinhdo` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `vitri`
--

DROP TABLE IF EXISTS `vitri`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `vitri` (
  `idViTri` int NOT NULL AUTO_INCREMENT,
  `tenViTri` varchar(45) NOT NULL,
  PRIMARY KEY (`idViTri`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `vitri`
--

LOCK TABLES `vitri` WRITE;
/*!40000 ALTER TABLE `vitri` DISABLE KEYS */;
INSERT INTO `vitri` VALUES (1,'le tan'),(2,'phuc vu'),(3,'chuyen vien'),(4,'giam sat'),(5,'quan ly'),(6,'giam doc');
/*!40000 ALTER TABLE `vitri` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2020-05-06  0:22:05
