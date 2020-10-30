SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de données :  `shop`
--

-- --------------------------------------------------------

--
-- Structure de la table `emails`
--

DROP TABLE IF EXISTS `emails`;
CREATE TABLE IF NOT EXISTS `cats` (
  `id_email` int(11) NOT NULL,
  `email_address` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id_email`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Structure de la table `promotions`
--

DROP TABLE IF EXISTS `promotion`;
CREATE TABLE IF NOT EXISTS `commande` (
  `id_promotion` int(11) NOT NULL,
  `old_price` varchar(50) DEFAULT NULL,
  `new_price` varchar(50) DEFAULT NULL,
  `picture` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id_promotion`),
) ENGINE=MyISAM DEFAULT CHARSET=latin1;
