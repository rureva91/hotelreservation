-- phpMyAdmin SQL Dump
-- version 4.0.10.8
-- http://www.phpmyadmin.net
--
-- Host: 127.8.221.130:3306
-- Generation Time: Mar 18, 2015 at 07:25 PM
-- Server version: 5.5.41
-- PHP Version: 5.3.3

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `hotelreservation`
--

-- --------------------------------------------------------

--
-- Table structure for table `HotelReservation`
--

CREATE TABLE IF NOT EXISTS `HotelReservation` (
  `Name` varchar(30) NOT NULL,
  `Phone number` int(10) NOT NULL,
  `Email id` varchar(30) NOT NULL,
  `Room type` varchar(20) NOT NULL,
  `Card Type` varchar(10) NOT NULL,
  `card Number` int(30) NOT NULL,
  `Check in` date NOT NULL,
  `Check Out` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `HotelReservation`
--

INSERT INTO `HotelReservation` (`Name`, `Phone number`, `Email id`, `Room type`, `Card Type`, `card Number`, `Check in`, `Check Out`) VALUES
('Revathi', 2147483647, 'rureva91@gmail.com', 'single', 'visa', 1234567890, '2015-03-21', '2015-03-31'),
('Shuba', 123456789, 'shbn.karthik@gmail.com', 'double', 'visa', 1234567890, '2015-03-27', '2015-03-31');

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
