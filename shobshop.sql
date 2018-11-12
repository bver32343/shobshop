-- phpMyAdmin SQL Dump
-- version 4.8.3
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Nov 11, 2018 at 01:08 PM
-- Server version: 10.1.36-MariaDB
-- PHP Version: 7.2.11

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `shobshop`
--

-- --------------------------------------------------------

--
-- Table structure for table `address`
--

CREATE TABLE `address` (
  `AddressID` int(15) NOT NULL,
  `HomeNo` int(15) NOT NULL,
  `Alley` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL,
  `Road` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `District` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `Sub-district` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `City` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL,
  `PostCode` int(5) NOT NULL,
  `Country` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `User_UserID` int(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- --------------------------------------------------------

--
-- Table structure for table `category`
--

CREATE TABLE `category` (
  `CategoryID` int(15) NOT NULL,
  `Name` varchar(50) COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- --------------------------------------------------------

--
-- Table structure for table `creditcard`
--

CREATE TABLE `creditcard` (
  `CreditCardID` int(15) NOT NULL,
  `CreditName` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `CreditCardNo` int(16) NOT NULL,
  `Type` varchar(10) COLLATE utf8_unicode_ci NOT NULL,
  `EXP` date NOT NULL,
  `CW` int(3) NOT NULL,
  `Payment_PaymentID` int(15) NOT NULL,
  `User_UserID` int(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- --------------------------------------------------------

--
-- Table structure for table `order`
--

CREATE TABLE `order` (
  `OrderID` int(15) NOT NULL,
  `Date` date NOT NULL,
  `TotalPrice` int(11) NOT NULL,
  `Shipping_ShippingID` int(15) NOT NULL,
  `Payment_ParmentID` int(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- --------------------------------------------------------

--
-- Table structure for table `orderdetail`
--

CREATE TABLE `orderdetail` (
  `OderDetailID` int(15) NOT NULL,
  `Quantity` int(50) NOT NULL,
  `ProductID` int(15) NOT NULL,
  `Order_OderID` int(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- --------------------------------------------------------

--
-- Table structure for table `payment`
--

CREATE TABLE `payment` (
  `PaymentID` int(15) NOT NULL,
  `User_UserID` int(15) NOT NULL,
  `Date` date NOT NULL,
  `TotalPriceForAll` int(50) NOT NULL,
  `BankAccountNo` int(10) DEFAULT NULL,
  `CreditCard_CreditCardID` int(15) DEFAULT NULL,
  `Order_OrderID` int(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- --------------------------------------------------------

--
-- Table structure for table `product`
--

CREATE TABLE `product` (
  `ProductID` int(15) NOT NULL,
  `ProductName` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `ProductDetail` varchar(100) COLLATE utf8_unicode_ci NOT NULL,
  `ProductPrice` int(11) NOT NULL,
  `QuantityInStock` int(11) NOT NULL,
  `PictureURL` varchar(100) COLLATE utf8_unicode_ci DEFAULT NULL,
  `ShippingPrice` int(11) NOT NULL DEFAULT '0',
  `Category_CategoryID` int(15) NOT NULL,
  `Shop_ShopID` int(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- --------------------------------------------------------

--
-- Table structure for table `report`
--

CREATE TABLE `report` (
  `ReportID` int(15) NOT NULL,
  `ReportType` varchar(100) COLLATE utf8_unicode_ci NOT NULL,
  `ReportDetail` varchar(500) COLLATE utf8_unicode_ci NOT NULL,
  `User_UserID` int(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- --------------------------------------------------------

--
-- Table structure for table `review`
--

CREATE TABLE `review` (
  `ReviewID` int(15) NOT NULL,
  `Rate` int(10) NOT NULL,
  `Comment` varchar(500) COLLATE utf8_unicode_ci DEFAULT NULL,
  `Product_ProductID` int(15) NOT NULL,
  `User_UserID` int(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- --------------------------------------------------------

--
-- Table structure for table `shipping`
--

CREATE TABLE `shipping` (
  `ShippingID` int(15) NOT NULL,
  `Tracking` int(11) DEFAULT NULL,
  `TypeOfShipping_TypeOfShippingID` int(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- --------------------------------------------------------

--
-- Table structure for table `shop`
--

CREATE TABLE `shop` (
  `ShopID` int(15) NOT NULL,
  `ShopName` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `ShopDetail` varchar(500) COLLATE utf8_unicode_ci NOT NULL,
  `User_UserID` int(15) NOT NULL,
  `Report_ReportID` int(15) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- --------------------------------------------------------

--
-- Table structure for table `shoppingcart`
--

CREATE TABLE `shoppingcart` (
  `ShoppingCartID` int(15) NOT NULL,
  `Quantity` int(11) NOT NULL DEFAULT '0',
  `User_UserID` int(15) DEFAULT NULL,
  `Product_ProductID` int(15) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- --------------------------------------------------------

--
-- Table structure for table `typeofshipping`
--

CREATE TABLE `typeofshipping` (
  `TypeOfShippingID` int(15) NOT NULL,
  `Name` varchar(10) COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

CREATE TABLE `user` (
  `UserID` int(15) NOT NULL,
  `FirstName` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `LastName` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `E-mail` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `PhoneNumber` int(10) NOT NULL,
  `ShoppingCart_ShoppingCartId` int(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- --------------------------------------------------------

--
-- Table structure for table `wallet`
--

CREATE TABLE `wallet` (
  `WalletID` int(15) NOT NULL,
  `Balance` int(11) NOT NULL,
  `User_UserID` int(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `address`
--
ALTER TABLE `address`
  ADD PRIMARY KEY (`AddressID`),
  ADD KEY `User_UserID_FK` (`User_UserID`);

--
-- Indexes for table `category`
--
ALTER TABLE `category`
  ADD PRIMARY KEY (`CategoryID`);

--
-- Indexes for table `creditcard`
--
ALTER TABLE `creditcard`
  ADD PRIMARY KEY (`CreditCardID`),
  ADD KEY `Payment_PaymentID_FK` (`Payment_PaymentID`) USING BTREE,
  ADD KEY `User_UserID_FK` (`User_UserID`) USING BTREE;

--
-- Indexes for table `order`
--
ALTER TABLE `order`
  ADD PRIMARY KEY (`OrderID`),
  ADD KEY `Payment_PaymentID_FK` (`Payment_ParmentID`),
  ADD KEY `Shipping_ShippingID_FK` (`Shipping_ShippingID`);

--
-- Indexes for table `orderdetail`
--
ALTER TABLE `orderdetail`
  ADD PRIMARY KEY (`OderDetailID`),
  ADD KEY `Order_OrderID_FK` (`Order_OderID`);

--
-- Indexes for table `payment`
--
ALTER TABLE `payment`
  ADD PRIMARY KEY (`PaymentID`),
  ADD KEY `CreditCard_CreditCardID_FK` (`CreditCard_CreditCardID`),
  ADD KEY `Order_OrderID_FK` (`Order_OrderID`) USING BTREE,
  ADD KEY `User_UserID_FK` (`User_UserID`) USING BTREE;

--
-- Indexes for table `product`
--
ALTER TABLE `product`
  ADD PRIMARY KEY (`ProductID`),
  ADD KEY `Category_CategoryID_FK` (`Category_CategoryID`) USING BTREE,
  ADD KEY `Shop_ShopID_FK` (`Shop_ShopID`) USING BTREE;

--
-- Indexes for table `report`
--
ALTER TABLE `report`
  ADD PRIMARY KEY (`ReportID`),
  ADD KEY `User_UserID_FK` (`User_UserID`) USING BTREE;

--
-- Indexes for table `review`
--
ALTER TABLE `review`
  ADD PRIMARY KEY (`ReviewID`),
  ADD KEY `Product_ProductID_FK` (`Product_ProductID`) USING BTREE,
  ADD KEY `User_UserID_FK` (`User_UserID`) USING BTREE;

--
-- Indexes for table `shipping`
--
ALTER TABLE `shipping`
  ADD PRIMARY KEY (`ShippingID`),
  ADD KEY `TypeOfShipping_TypeOfShippingID_FK` (`TypeOfShipping_TypeOfShippingID`) USING BTREE;

--
-- Indexes for table `shop`
--
ALTER TABLE `shop`
  ADD PRIMARY KEY (`ShopID`),
  ADD KEY `Report_ReportID_FK` (`Report_ReportID`) USING BTREE,
  ADD KEY `User_UserID_FK` (`User_UserID`) USING BTREE;

--
-- Indexes for table `shoppingcart`
--
ALTER TABLE `shoppingcart`
  ADD PRIMARY KEY (`ShoppingCartID`);

--
-- Indexes for table `typeofshipping`
--
ALTER TABLE `typeofshipping`
  ADD PRIMARY KEY (`TypeOfShippingID`);

--
-- Indexes for table `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`UserID`),
  ADD KEY `ShoppingCart_ShoppingCartID_FK` (`ShoppingCart_ShoppingCartId`) USING BTREE;

--
-- Indexes for table `wallet`
--
ALTER TABLE `wallet`
  ADD PRIMARY KEY (`WalletID`),
  ADD KEY `User_UserID_FK` (`User_UserID`) USING BTREE;

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `address`
--
ALTER TABLE `address`
  MODIFY `AddressID` int(15) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `category`
--
ALTER TABLE `category`
  MODIFY `CategoryID` int(15) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `creditcard`
--
ALTER TABLE `creditcard`
  MODIFY `CreditCardID` int(15) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `order`
--
ALTER TABLE `order`
  MODIFY `OrderID` int(15) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `orderdetail`
--
ALTER TABLE `orderdetail`
  MODIFY `OderDetailID` int(15) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `payment`
--
ALTER TABLE `payment`
  MODIFY `PaymentID` int(15) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `product`
--
ALTER TABLE `product`
  MODIFY `ProductID` int(15) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `report`
--
ALTER TABLE `report`
  MODIFY `ReportID` int(15) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `review`
--
ALTER TABLE `review`
  MODIFY `ReviewID` int(15) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `shipping`
--
ALTER TABLE `shipping`
  MODIFY `ShippingID` int(15) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `shop`
--
ALTER TABLE `shop`
  MODIFY `ShopID` int(15) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `shoppingcart`
--
ALTER TABLE `shoppingcart`
  MODIFY `ShoppingCartID` int(15) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `typeofshipping`
--
ALTER TABLE `typeofshipping`
  MODIFY `TypeOfShippingID` int(15) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `user`
--
ALTER TABLE `user`
  MODIFY `UserID` int(15) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `wallet`
--
ALTER TABLE `wallet`
  MODIFY `WalletID` int(15) NOT NULL AUTO_INCREMENT;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `address`
--
ALTER TABLE `address`
  ADD CONSTRAINT `User_UserID_FK` FOREIGN KEY (`User_UserID`) REFERENCES `user` (`UserID`);

--
-- Constraints for table `order`
--
ALTER TABLE `order`
  ADD CONSTRAINT `Payment_PaymentID_FK` FOREIGN KEY (`Payment_ParmentID`) REFERENCES `payment` (`PaymentID`),
  ADD CONSTRAINT `Shipping_ShippingID_FK` FOREIGN KEY (`Shipping_ShippingID`) REFERENCES `shipping` (`ShippingID`);

--
-- Constraints for table `orderdetail`
--
ALTER TABLE `orderdetail`
  ADD CONSTRAINT `Order_OrderID_FK` FOREIGN KEY (`Order_OderID`) REFERENCES `order` (`OrderID`);

--
-- Constraints for table `payment`
--
ALTER TABLE `payment`
  ADD CONSTRAINT `CreditCard_CreditCardID_FK` FOREIGN KEY (`CreditCard_CreditCardID`) REFERENCES `creditcard` (`CreditCardID`),
  ADD CONSTRAINT `payment_ibfk_1` FOREIGN KEY (`Order_OrderID`) REFERENCES `order` (`OrderID`),
  ADD CONSTRAINT `payment_ibfk_2` FOREIGN KEY (`User_UserID`) REFERENCES `user` (`UserID`);

--
-- Constraints for table `product`
--
ALTER TABLE `product`
  ADD CONSTRAINT `product_ibfk_1` FOREIGN KEY (`Category_CategoryID`) REFERENCES `category` (`CategoryID`),
  ADD CONSTRAINT `product_ibfk_2` FOREIGN KEY (`Shop_ShopID`) REFERENCES `shop` (`ShopID`);

--
-- Constraints for table `report`
--
ALTER TABLE `report`
  ADD CONSTRAINT `report_ibfk_1` FOREIGN KEY (`User_UserID`) REFERENCES `user` (`UserID`);

--
-- Constraints for table `review`
--
ALTER TABLE `review`
  ADD CONSTRAINT `review_ibfk_1` FOREIGN KEY (`Product_ProductID`) REFERENCES `product` (`ProductID`),
  ADD CONSTRAINT `review_ibfk_2` FOREIGN KEY (`User_UserID`) REFERENCES `user` (`UserID`);

--
-- Constraints for table `shipping`
--
ALTER TABLE `shipping`
  ADD CONSTRAINT `shipping_ibfk_1` FOREIGN KEY (`TypeOfShipping_TypeOfShippingID`) REFERENCES `typeofshipping` (`TypeOfShippingID`);

--
-- Constraints for table `shop`
--
ALTER TABLE `shop`
  ADD CONSTRAINT `shop_ibfk_1` FOREIGN KEY (`Report_ReportID`) REFERENCES `report` (`ReportID`),
  ADD CONSTRAINT `shop_ibfk_2` FOREIGN KEY (`User_UserID`) REFERENCES `user` (`UserID`);

--
-- Constraints for table `user`
--
ALTER TABLE `user`
  ADD CONSTRAINT `ShoppingCart_ShoppingCartID` FOREIGN KEY (`ShoppingCart_ShoppingCartId`) REFERENCES `shoppingcart` (`ShoppingCartID`);

--
-- Constraints for table `wallet`
--
ALTER TABLE `wallet`
  ADD CONSTRAINT `wallet_ibfk_1` FOREIGN KEY (`User_UserID`) REFERENCES `user` (`UserID`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
