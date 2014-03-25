-- phpMyAdmin SQL Dump
-- version 3.5.1
-- http://www.phpmyadmin.net
--
-- Host: localhost
-- Generation Time: Mar 20, 2014 at 03:38 PM
-- Server version: 5.5.24-log
-- PHP Version: 5.4.3

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `rtrw`
--
CREATE DATABASE `rtrw` DEFAULT CHARACTER SET latin1 COLLATE latin1_swedish_ci;
USE `rtrw`;

-- --------------------------------------------------------

--
-- Table structure for table `agama`
--

CREATE TABLE IF NOT EXISTS `agama` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `NAME` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Table structure for table `jenis_kelamin`
--

CREATE TABLE IF NOT EXISTS `jenis_kelamin` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `NAME` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Table structure for table `penduduk`
--

CREATE TABLE IF NOT EXISTS `penduduk` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nik` varchar(20) NOT NULL,
  `name` varchar(100) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=2 ;

--
-- Dumping data for table `penduduk`
--

INSERT INTO `penduduk` (`id`, `nik`, `name`) VALUES
(1, '1201006234', 'Junifar Hidayat');

-- --------------------------------------------------------

--
-- Table structure for table `rumah`
--

CREATE TABLE IF NOT EXISTS `rumah` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `BLOK_RUMAH` char(1) DEFAULT NULL,
  `NOMOR_RUMAH` int(11) DEFAULT NULL,
  `KEPALA_KELUARGA_ID` int(11) DEFAULT NULL,
  `TELP` varchar(20) DEFAULT NULL,
  `HANDPHONE` varchar(40) DEFAULT NULL,
  `CREATED` datetime DEFAULT NULL,
  `MODIFIED` datetime DEFAULT NULL,
  `USER_CREATED` int(11) DEFAULT NULL,
  `USER_MODIFIED` int(11) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Table structure for table `status_keluarga`
--

CREATE TABLE IF NOT EXISTS `status_keluarga` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `NAME` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Table structure for table `status_pernikahan`
--

CREATE TABLE IF NOT EXISTS `status_pernikahan` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `NAME` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Table structure for table `warga`
--

CREATE TABLE IF NOT EXISTS `warga` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `ID_RUMAH` int(11) DEFAULT NULL,
  `NAMA` varchar(100) DEFAULT NULL,
  `JENIS_KELAMIN` int(11) DEFAULT NULL,
  `AGAMA` int(11) DEFAULT NULL,
  `STATUS_PERNIKAHAN` int(11) DEFAULT NULL,
  `STATUS_DALAM_KELUARGA` int(11) DEFAULT NULL,
  `HANDPHONE` varchar(40) DEFAULT NULL,
  `TEMPAT_LAHIR` varchar(100) DEFAULT NULL,
  `TANGGAL_LAHIR` datetime DEFAULT NULL,
  `CREATED` datetime DEFAULT NULL,
  `MODIFIED` datetime DEFAULT NULL,
  `USER_CREATED` int(11) DEFAULT NULL,
  `USER_MODIFIED` int(11) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
