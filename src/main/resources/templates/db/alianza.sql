-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 03-04-2023 a las 22:14:45
-- Versión del servidor: 10.4.27-MariaDB
-- Versión de PHP: 8.2.0

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `alianza`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `admin`
--

CREATE TABLE `admin` (
  `IDAdmin` int(11) NOT NULL,
  `Nombre` varchar(30) NOT NULL,
  `Documento` int(11) NOT NULL,
  `ModificarServ` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

--
-- Volcado de datos para la tabla `admin`
--

INSERT INTO `admin` (`IDAdmin`, `Nombre`, `Documento`, `ModificarServ`) VALUES
(1, 'Jorge', 12345, 5),
(2, 'Camilo', 123456, 2),
(3, 'Jesus', 1234567, 9),
(4, 'Nicolas', 12345678, 7),
(5, 'Pepito', 123456789, 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `clientes`
--

CREATE TABLE `clientes` (
  `IdCliente` int(11) NOT NULL,
  `Nombre` varchar(30) NOT NULL,
  `Apellido` varchar(30) NOT NULL,
  `Documento` int(11) NOT NULL,
  `Telefono` bigint(15) NOT NULL,
  `Correo` varchar(30) NOT NULL,
  `Servicio` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

--
-- Volcado de datos para la tabla `clientes`
--

INSERT INTO `clientes` (`IdCliente`, `Nombre`, `Apellido`, `Documento`, `Telefono`, `Correo`, `Servicio`) VALUES
(1, 'Luis', 'Vega', 112233, 3011234567, 'luisvega@gmail.com', 2),
(2, 'Pedro', 'Rivera', 112244, 3011234566, 'pedrorivera@gmail.com', 1),
(3, 'Martha', 'Franco', 112255, 3011234577, 'marthaf@gmail.com', 7),
(4, 'Ricardo', 'Ordoñez', 112266, 3011234555, 'ordoñezricardo@gmail.com', 5),
(5, 'Maria', 'Gonzalez', 112277, 3011234444, 'mariagonzalez@gmail.com', 6);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `servicios`
--

CREATE TABLE `servicios` (
  `IDServicio` int(11) NOT NULL,
  `TipoServicio` int(11) NOT NULL,
  `Precio` double NOT NULL,
  `NombreServicio` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

--
-- Volcado de datos para la tabla `servicios`
--

INSERT INTO `servicios` (`IDServicio`, `TipoServicio`, `Precio`, `NombreServicio`) VALUES
(1, 1, 0, 'Gratuito contable'),
(2, 1, 2, 'Basico-Contabilidad'),
(3, 1, 4, 'Contabilidad-Negocios'),
(4, 1, 6, 'Contabilidad-Pymes'),
(5, 1, 8, 'Contabilidad-Empresas'),
(6, 2, 0, 'Gratuito judicial'),
(7, 2, 2, 'Basico-Judicial'),
(8, 2, 4, 'Judicial-Negocios'),
(9, 2, 6, 'Judicial-Pymes'),
(10, 2, 8, 'Judicial-Empresas');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tiposervicio`
--

CREATE TABLE `tiposervicio` (
  `IDTipoServicio` int(11) NOT NULL,
  `Categoria` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

--
-- Volcado de datos para la tabla `tiposervicio`
--

INSERT INTO `tiposervicio` (`IDTipoServicio`, `Categoria`) VALUES
(1, 'Contable'),
(2, 'Judicial');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `admin`
--
ALTER TABLE `admin`
  ADD PRIMARY KEY (`IDAdmin`),
  ADD KEY `fk_admin_servicio` (`ModificarServ`);

--
-- Indices de la tabla `clientes`
--
ALTER TABLE `clientes`
  ADD PRIMARY KEY (`IdCliente`),
  ADD KEY `fk_cliente_servicio` (`Servicio`);

--
-- Indices de la tabla `servicios`
--
ALTER TABLE `servicios`
  ADD PRIMARY KEY (`IDServicio`),
  ADD KEY `TipoServicio` (`TipoServicio`);

--
-- Indices de la tabla `tiposervicio`
--
ALTER TABLE `tiposervicio`
  ADD PRIMARY KEY (`IDTipoServicio`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `admin`
--
ALTER TABLE `admin`
  MODIFY `IDAdmin` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT de la tabla `clientes`
--
ALTER TABLE `clientes`
  MODIFY `IdCliente` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT de la tabla `servicios`
--
ALTER TABLE `servicios`
  MODIFY `IDServicio` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- AUTO_INCREMENT de la tabla `tiposervicio`
--
ALTER TABLE `tiposervicio`
  MODIFY `IDTipoServicio` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `admin`
--
ALTER TABLE `admin`
  ADD CONSTRAINT `fk_admin_servicio` FOREIGN KEY (`ModificarServ`) REFERENCES `servicios` (`IDServicio`);

--
-- Filtros para la tabla `clientes`
--
ALTER TABLE `clientes`
  ADD CONSTRAINT `fk_cliente_servicio` FOREIGN KEY (`Servicio`) REFERENCES `servicios` (`IDServicio`);

--
-- Filtros para la tabla `servicios`
--
ALTER TABLE `servicios`
  ADD CONSTRAINT `servicios_ibfk_1` FOREIGN KEY (`TipoServicio`) REFERENCES `tiposervicio` (`IDTipoServicio`);

--
-- Filtros para la tabla `tiposervicio`
--
ALTER TABLE `tiposervicio`
  ADD CONSTRAINT `fk_tipoServicio_servicio` FOREIGN KEY (`IDTipoServicio`) REFERENCES `servicios` (`IDServicio`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
