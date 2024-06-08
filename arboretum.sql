-- phpMyAdmin SQL Dump
-- version 4.1.4
-- http://www.phpmyadmin.net
--
-- Client :  127.0.0.1
-- Généré le :  Sam 08 Juin 2024 à 23:53
-- Version du serveur :  5.6.15-log
-- Version de PHP :  5.4.24

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Base de données :  `arboretum`
--

-- --------------------------------------------------------

--
-- Structure de la table `arbre`
--

CREATE TABLE IF NOT EXISTS `arbre` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `description` varchar(200) DEFAULT NULL,
  `anneePlantation` int(5) NOT NULL DEFAULT '2021',
  `photo` varchar(300) DEFAULT NULL,
  `remarquable` tinyint(1) NOT NULL DEFAULT '0',
  `idEspece` varchar(20) NOT NULL,
  `idZone` varchar(20) NOT NULL DEFAULT 'SYST',
  PRIMARY KEY (`id`),
  KEY `arbre_ibfk_1` (`idEspece`),
  KEY `arbre_ibfk_2` (`idZone`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=60 ;

--
-- Contenu de la table `arbre`
--

INSERT INTO `arbre` (`id`, `description`, `anneePlantation`, `photo`, `remarquable`, `idEspece`, `idZone`) VALUES
(1, 'petit araucaria', 1990, NULL, 0, 'ARA', 'SYST'),
(2, 'grand araucaria', 2021, NULL, 0, 'ARA', 'SYST'),
(3, 'grand bouleau', 1987, NULL, 0, 'BOUV', 'EURO'),
(4, 'petit bouleau', 2024, NULL, 0, 'BOUV', 'EURO'),
(5, 'petit bunya-bunya', 1975, NULL, 0, 'BUN', 'SYST'),
(6, 'bunya-bunya 2', 1978, NULL, 0, 'BUN', 'SYST'),
(7, 'grand cèdre', 1870, NULL, 0, 'CEDA', 'SYST'),
(8, 'très vieux cèdre', 1800, NULL, 1, 'CEDL', 'SYST'),
(9, 'beau cèdre', 1930, NULL, 0, 'CEDB', 'SYST'),
(10, 'joli cèdre', 1896, NULL, 0, 'CEDB', 'SYST'),
(11, 'jeune cèdre', 1940, NULL, 0, 'CEDC', 'SYST'),
(12, 'vieux cèdre', 1920, NULL, 0, 'CEDH', 'SYST'),
(13, 'vieux cerisier', 1960, NULL, 0, 'CERC', 'EURO'),
(14, 'beau cerisier', 1970, NULL, 0, 'CERJ', 'ASIA'),
(15, 'vieux chêne rouge', 1951, NULL, 0, 'CHER', 'AMER'),
(16, 'chêne rouge malade', 1954, NULL, 0, 'CHER', 'AMER'),
(17, 'jeune cyprès', 2007, NULL, 0, 'CYPC', 'AMER'),
(18, 'beau cyprès', 1970, NULL, 0, 'CYPCO', 'SYST'),
(19, 'beau cyprès 2', 1975, NULL, 0, 'CYPM', 'AMER'),
(20, 'beau cyprès 3', 1964, NULL, 0, 'CYPM', 'AMER'),
(21, 'petit épicéa', 1975, NULL, 0, 'EPIC', 'EURO'),
(22, 'viel érable', 1930, NULL, 0, 'ERAP', 'HORT'),
(23, 'très grand érable', 1896, NULL, 1, 'ERAS', 'AMER'),
(24, 'jeune érable', 1975, NULL, 0, 'ERAS', 'AMER'),
(25, 'genévrier', 1970, NULL, 0, 'GENC', 'HORT'),
(26, 'jeune arbre', 2001, NULL, 0, 'GENCA', 'SYST'),
(27, 'viel arbre tordu', 1896, NULL, 0, 'GENCH', 'ASIA'),
(28, 'arbre', 1960, NULL, 0, 'GENP', 'SYST'),
(29, 'bel arbre', 1920, NULL, 0, 'GINK', 'ASIA'),
(30, 'gommier cidre', 1940, NULL, 0, 'GOMC', 'SYST'),
(31, 'vieux gommier cidre', 1896, NULL, 1, 'GOMC', 'SYST'),
(32, 'beau gommier cidre', 1930, NULL, 0, 'GOMG', 'SYST'),
(33, 'gommier noir', 1920, NULL, 0, 'GOMN', 'SYST'),
(34, 'bel hévéa', 1951, NULL, 0, 'HEVE', 'SYST'),
(35, 'viel arbre gris', 1920, NULL, 0, 'IFC', 'EURO'),
(36, 'beau marronnier', 1937, NULL, 0, 'MARI', 'HORT'),
(37, 'jeune mélèze', 2021, NULL, 0, 'MELE', 'EURO'),
(38, 'jeune orme', 2007, NULL, 0, 'ORMC', 'EURO'),
(39, 'peuplier blanc', 1954, NULL, 0, 'PEUB', 'EURO'),
(40, 'peuplier noir', 1960, NULL, 0, 'PEUN', 'EURO'),
(41, 'joli pin', 1970, NULL, 0, 'PINA', 'HORT'),
(42, 'vieux tulipier', 1800, NULL, 0, 'TULV', 'AMER'),
(43, 'jeune tulipier', 1954, NULL, 0, 'TULV', 'AMER'),
(44, 'beau pin', 1960, NULL, 0, 'PINA', 'EURO'),
(45, 'pin bizarre', 1954, NULL, 0, 'PINP', 'HORT'),
(46, 'vieux pin', 1930, NULL, 0, 'PINS', 'EURO'),
(47, 'arbre très rare', 2010, NULL, 0, 'PINW', 'SYST'),
(48, 'grand platane', 1930, NULL, 0, 'PLAC', 'HORT'),
(49, 'vieux sapin', 1905, NULL, 0, 'SAPA', 'HORT'),
(50, 'beau sapin', 1940, NULL, 0, 'SAPC', 'EURO'),
(51, 'sapin malade', 1943, NULL, 0, 'SAPN', 'HORT'),
(52, 'beau saule', 1902, NULL, 0, 'SAUP', 'ASIA'),
(53, 'arbre géant', 1891, NULL, 0, 'SEQG', 'AMER'),
(54, 'vieux et beau séquoia', 1900, NULL, 1, 'SEQS', 'AMER'),
(55, 'sumac', 1954, NULL, 0, 'SUMV', 'AMER'),
(56, 'grand Thuya', 1939, NULL, 0, 'THUC', 'AMER'),
(57, 'vieux Thuya', 1921, NULL, 0, 'THUO', 'AMER'),
(58, 'Thuya malade', 1930, NULL, 0, 'THUP', 'AMER'),
(59, 'beau Thuya', 1920, NULL, 0, 'THUP', 'AMER');

-- --------------------------------------------------------

--
-- Structure de la table `continent`
--

CREATE TABLE IF NOT EXISTS `continent` (
  `id` varchar(30) NOT NULL,
  `nom` varchar(100) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Contenu de la table `continent`
--

INSERT INTO `continent` (`id`, `nom`) VALUES
('AFRI', 'Afrique'),
('AMEN', 'Amérique Nord'),
('AMES', 'Amérique Sud'),
('ASIE', 'Asie Est'),
('ASIO', 'Asie Ouest'),
('EURO', 'Europe'),
('OCEA', 'Océanie');

-- --------------------------------------------------------

--
-- Structure de la table `espece`
--

CREATE TABLE IF NOT EXISTS `espece` (
  `id` varchar(20) NOT NULL,
  `nom` varchar(200) NOT NULL,
  `nomScientifique` varchar(300) NOT NULL,
  `idContinent` varchar(20) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `espece_ibfk_1` (`idContinent`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Contenu de la table `espece`
--

INSERT INTO `espece` (`id`, `nom`, `nomScientifique`, `idContinent`) VALUES
('ARA', 'araucaria du Chili', 'Araucaria araucana', 'OCEA'),
('BOUV', 'bouleau verruqueux', 'Betula pendula', 'EURO'),
('BUN', 'bunya-bunya', 'Araucaria bidwillii', 'OCEA'),
('CEDA', 'cèdre de l''Atlas', 'Cedrus atlantica', 'ASIO'),
('CEDB', 'cèdre blanc', 'Calocedrus decurrens', 'AMEN'),
('CEDC', 'cèdre de Chypre', 'Cedrus brevifolia', 'EURO'),
('CEDH', 'cèdre de l''Himalaya', 'Cedrus deodara', 'ASIE'),
('CEDL', 'cèdre du Liban', 'Cedrus libani', 'ASIO'),
('CERC', 'cerisier de Cayenne', 'Eugenia uniflora', 'AMES'),
('CERJ', 'cerisier du Japon', 'Prunus serrulata', 'ASIE'),
('CHER', 'chêne rouge d''Amérique', 'Quercus rubra', 'AMEN'),
('CYPC', 'cyprès chauve', 'Taxodium distichum', 'AMEN'),
('CYPCO', 'cyprès commun', 'Cupressus sempervirens', 'ASIO'),
('CYPM', 'cyprès de Monterey', 'Cupressus macrocarpa', 'AMEN'),
('EPIC', 'épicéa commun', 'Picea abies', 'EURO'),
('ERAP', 'érable plane', 'Acer platanoides', 'EURO'),
('ERAS', 'érable à sucre', 'Acer saccharum', 'AMEN'),
('GENC', 'genévrier commun', 'Juniperus communis', 'EURO'),
('GENCA', 'genévrier cade', 'Juniperus oxycedrus', 'AFRI'),
('GENCH', 'genévrier de Chine', 'Juniperus chinensis', 'ASIE'),
('GENP', 'genévrier de Phénicie', 'Juniperus phoenicea', 'AFRI'),
('GINK', 'ginkgo', 'Ginkgo biloba', 'ASIE'),
('GOMC', 'gommier cidre', 'Eucalyptus gunnii', 'OCEA'),
('GOMG', 'gommier gris', 'Eucalyptus major', 'OCEA'),
('GOMN', 'gommier noir', 'Eucalyptus largiflorens', 'OCEA'),
('HEVE', 'arbre à caoutchouc', 'Hevea brasiliensis', 'AMES'),
('IFC', 'if commun', 'Taxus baccata', 'EURO'),
('MARI', 'marronnier d''Inde', 'Aesculus hippocastanum', 'ASIO'),
('MELE', 'mélèze d''Europe', 'Larix decidua', 'EURO'),
('ORMC', 'orme champêtre', 'Ulmus minor', 'EURO'),
('PEUB', 'peuplier blanc', 'Populus alba', 'EURO'),
('PEUN', 'peuplier noir', 'Populus nigra', 'EURO'),
('PINA', 'pin des Alpes', 'Pinus cembra', 'EURO'),
('PINM', 'pin de Monterey', 'Pinus radiata', 'AMEN'),
('PINP', 'pin parasol', 'Pinus pinea', 'EURO'),
('PINS', 'pin sylvestre', 'Pinus sylvestris', 'EURO'),
('PINW', 'pin de Wollemi', 'Wollemia nobilis', 'OCEA'),
('PLAC', 'platane commun', 'Platanus x acerifolia', 'EURO'),
('SAPA', 'sapin d''Andalousie', 'Abies pinsapo', 'EURO'),
('SAPC', 'sapin commun', 'Abies alba', 'EURO'),
('SAPN', 'sapin de Nordmann', 'Abies nordmanniana', 'ASIO'),
('SAPS', 'sapin de Sibérie', 'Abies sibirica', 'ASIE'),
('SAUP', 'saule pleureur', 'Salix babylonica', 'ASIE'),
('SEQG', 'séquoia géant', 'Sequoiadendron giganteum', 'AMEN'),
('SEQS', 'séquoia toujours vert', 'Sequoia sempervirens', 'AMEN'),
('SUMV', 'sumac vinaigrier', 'Rhus typhina', 'AMEN'),
('THUC', 'thuya de Corée', 'Thuya koraiensis', 'ASIE'),
('THUO', 'thuya du Canada', 'Thuya occidentalis', 'AMEN'),
('THUP', 'thuya géant de Californie', 'Thuya plicata', 'AMEN'),
('TULV', 'tulipier de Virginie', 'Liriodendron tulipifera', 'AMEN');

-- --------------------------------------------------------

--
-- Structure de la table `utilisateur`
--

CREATE TABLE IF NOT EXISTS `utilisateur` (
  `id` varchar(100) NOT NULL,
  `motDePasse` varchar(256) NOT NULL,
  `nom` varchar(256) DEFAULT NULL,
  `prenom` varchar(256) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Contenu de la table `utilisateur`
--

INSERT INTO `utilisateur` (`id`, `motDePasse`, `nom`, `prenom`) VALUES
('admin', '6f4fa8ba7b9141a21d0fc6618653702740d1c10fb76997deb0d7f6f62ac1c4c3', 'Admin', NULL);

-- --------------------------------------------------------

--
-- Structure de la table `zone`
--

CREATE TABLE IF NOT EXISTS `zone` (
  `id` varchar(30) NOT NULL,
  `nom` varchar(256) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Contenu de la table `zone`
--

INSERT INTO `zone` (`id`, `nom`) VALUES
('AMER', 'américaine'),
('ASIA', 'asiatique'),
('EURO', 'européenne'),
('HORT', 'horticole'),
('SYST', 'systématique');

--
-- Contraintes pour les tables exportées
--

--
-- Contraintes pour la table `arbre`
--
ALTER TABLE `arbre`
  ADD CONSTRAINT `arbre_ibfk_1` FOREIGN KEY (`idEspece`) REFERENCES `espece` (`id`),
  ADD CONSTRAINT `arbre_ibfk_2` FOREIGN KEY (`idZone`) REFERENCES `zone` (`id`);

--
-- Contraintes pour la table `espece`
--
ALTER TABLE `espece`
  ADD CONSTRAINT `espece_ibfk_1` FOREIGN KEY (`idContinent`) REFERENCES `continent` (`id`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
