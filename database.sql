-- --------------------------------------------------------
-- Host:                         127.0.0.1
-- Server version:               5.7.32-log - MySQL Community Server (GPL)
-- Server OS:                    Win64
-- HeidiSQL Version:             10.2.0.5599
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;


-- Dumping database structure for springproject
CREATE DATABASE IF NOT EXISTS `springproject` /*!40100 DEFAULT CHARACTER SET latin1 */;
USE `springproject`;

-- Dumping structure for table springproject.cart
CREATE TABLE IF NOT EXISTS `cart` (
  `id_cart` int(11) NOT NULL AUTO_INCREMENT,
  `date_created` datetime DEFAULT NULL,
  `total_amount` double NOT NULL,
  PRIMARY KEY (`id_cart`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=latin1;

-- Dumping data for table springproject.cart: ~4 rows (approximately)
/*!40000 ALTER TABLE `cart` DISABLE KEYS */;
INSERT IGNORE INTO `cart` (`id_cart`, `date_created`, `total_amount`) VALUES
	(1, '2021-03-27 05:30:00', 0),
	(2, '2021-03-27 05:30:00', 0),
	(3, '2021-03-27 05:30:00', 0),
	(4, '2021-03-27 05:30:00', 0);
/*!40000 ALTER TABLE `cart` ENABLE KEYS */;

-- Dumping structure for table springproject.cartitem
CREATE TABLE IF NOT EXISTS `cartitem` (
  `id_cart_item` int(11) NOT NULL AUTO_INCREMENT,
  `qty` double NOT NULL,
  `id_cart` int(11) DEFAULT NULL,
  `id_product` int(11) DEFAULT NULL,
  PRIMARY KEY (`id_cart_item`),
  KEY `FK88ec5if7ytt3hkwepb0qdl7yr` (`id_cart`),
  KEY `FKn5grofoxm51gh01c1w8c1qftj` (`id_product`),
  CONSTRAINT `FK88ec5if7ytt3hkwepb0qdl7yr` FOREIGN KEY (`id_cart`) REFERENCES `cart` (`id_cart`),
  CONSTRAINT `FKn5grofoxm51gh01c1w8c1qftj` FOREIGN KEY (`id_product`) REFERENCES `products` (`id_product`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=latin1;

-- Dumping data for table springproject.cartitem: ~6 rows (approximately)
/*!40000 ALTER TABLE `cartitem` DISABLE KEYS */;
INSERT IGNORE INTO `cartitem` (`id_cart_item`, `qty`, `id_cart`, `id_product`) VALUES
	(1, 10, 3, 3),
	(2, 10, 3, 2),
	(3, 10, 3, 3),
	(4, 10, 3, 3),
	(6, 10, 3, 4),
	(7, 10, 1, 3);
/*!40000 ALTER TABLE `cartitem` ENABLE KEYS */;

-- Dumping structure for table springproject.gender
CREATE TABLE IF NOT EXISTS `gender` (
  `id_gender` int(11) NOT NULL AUTO_INCREMENT,
  `value` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id_gender`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Dumping data for table springproject.gender: ~0 rows (approximately)
/*!40000 ALTER TABLE `gender` DISABLE KEYS */;
/*!40000 ALTER TABLE `gender` ENABLE KEYS */;

-- Dumping structure for table springproject.products
CREATE TABLE IF NOT EXISTS `products` (
  `id_product` int(11) NOT NULL AUTO_INCREMENT,
  `product_description` varchar(255) DEFAULT NULL,
  `product_name` varchar(255) DEFAULT NULL,
  `product_price` double NOT NULL,
  PRIMARY KEY (`id_product`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=latin1;

-- Dumping data for table springproject.products: ~4 rows (approximately)
/*!40000 ALTER TABLE `products` DISABLE KEYS */;
INSERT IGNORE INTO `products` (`id_product`, `product_description`, `product_name`, `product_price`) VALUES
	(2, 'Energy Drink', 'Miloooo', 65),
	(3, 'Snack', 'Marie', 30),
	(4, 'Writting Pen', 'Pen', 15),
	(5, 'Sample Product Description', 'Saample Product Name', 0);
/*!40000 ALTER TABLE `products` ENABLE KEYS */;

-- Dumping structure for table springproject.user
CREATE TABLE IF NOT EXISTS `user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `address` varchar(255) DEFAULT NULL,
  `age` int(11) NOT NULL,
  `name` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `telephone` int(11) NOT NULL,
  `username` varchar(255) DEFAULT NULL,
  `id_gender` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK2q2e2aefyrvp7frjv6a1lqdh9` (`id_gender`),
  CONSTRAINT `FK2q2e2aefyrvp7frjv6a1lqdh9` FOREIGN KEY (`id_gender`) REFERENCES `gender` (`id_gender`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Dumping data for table springproject.user: ~0 rows (approximately)
/*!40000 ALTER TABLE `user` DISABLE KEYS */;
/*!40000 ALTER TABLE `user` ENABLE KEYS */;

/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
