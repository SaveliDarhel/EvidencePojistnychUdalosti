-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Počítač: 127.0.0.1
-- Vytvořeno: Sob 26. bře 2022, 19:46
-- Verze serveru: 10.4.22-MariaDB
-- Verze PHP: 8.1.2

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Databáze: `evidence_pojistnych_udalosti`
--

-- --------------------------------------------------------

--
-- Struktura tabulky `adresy`
--

CREATE TABLE `adresy` (
  `id` int(11) NOT NULL,
  `pojisteny_id` int(11) DEFAULT NULL,
  `ulice` varchar(30) COLLATE utf8_czech_ci DEFAULT NULL,
  `cislo_popisne` int(11) DEFAULT NULL,
  `cislo_orientacni` int(11) DEFAULT NULL,
  `psc` varchar(6) COLLATE utf8_czech_ci DEFAULT NULL,
  `mestska_cast` varchar(60) COLLATE utf8_czech_ci DEFAULT NULL,
  `mesto` varchar(30) COLLATE utf8_czech_ci DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_czech_ci;

--
-- Vypisuji data pro tabulku `adresy`
--

INSERT INTO `adresy` (`id`, `pojisteny_id`, `ulice`, `cislo_popisne`, `cislo_orientacni`, `psc`, `mestska_cast`, `mesto`) VALUES
(95, 47, 'Karafiátova', 1327, 0, '798 52', 'Konice', 'Konice Olomoucký kraj'),
(98, 48, 'Generála Jaroše', 333, 25, '59444', 'Radostín Nad Oslavou', 'Kraj Vysocina'),
(99, 49, 'Pod Malsičkou', 1519, 1, '387 01', 'Volyne', 'Volyne Jihoceský kraj'),
(100, 50, 'Petrželka', 1667, 35, '768 03', 'Roštín', 'Zlínský kraj'),
(101, 51, 'Fibichova', 1122, 13, '277 13', 'Hlavní mesto Praha', 'Hlavní mesto Praha'),
(102, 52, 'Větrník', 659, 9, '549 54', 'Police Nad Metují', 'Královéhradecký kraj'),
(103, 53, 'Strmá', 1859, 15, '739 46', 'Hukvaldy', 'Moravskoslezský kraj'),
(104, 54, 'Mlýnská', 1097, 2, '588 62', 'Urbanov', 'Urbanov Kraj Vysocina'),
(105, 55, 'Truhlářská', 612, 45, '395 01', 'Pacov', 'Pacov Kraj Vysocina'),
(106, 56, 'Václava Haňky', 1858, 23, '664 53', 'Újezd U Brna', 'Jihomoravský kraj'),
(108, 57, 'Sokolská', 896, 3, '783 75', 'Dub Nad Moravou', 'Moravskoslezský kraj'),
(109, 58, 'Hálkova', 1002, 2, '471 24', 'Mimon', 'Mimon Liberecký kraj'),
(110, 59, 'Bártova', 336, 8, '679 61', 'Letovice', 'Jihomoravský kraj'),
(111, 60, 'Velký průhon', 1414, 12, '289 03', 'Mestec Králové', 'Stredoceský kraj'),
(112, 61, 'Poštovní', 1717, 17, '294 25', 'Katusice', 'Stredoceský kraj'),
(113, 62, 'V Trávníkách', 1447, 5, '468 22', 'Železný Brod', 'Liberecký kraj'),
(114, 63, 'Sídliště Za Chlumem', 361, 5, '417 31', 'Novosedlice', 'Ústecký kraj'),
(115, 64, 'V Trávníkách', 178, 3, '468 33', 'Jenišovice U Jablonce Nad Nisou', 'Liberecký kraj'),
(116, 65, 'Čechova', 1964, 11, '539 74', 'Predhradí', 'Pardubický kraj'),
(117, 66, 'Budovatelská', 167, 0, '388 01', 'Blatná', 'Jihoceský kraj'),
(118, 67, 'Budovatelská', 427, 5, '388 01', 'Blatná', 'Blatná Jihoceský kraj'),
(119, 68, 'Masarykova', 1729, 13, '583 01', 'Chotebor', 'Chotebor Kraj Vysocina'),
(120, 69, 'Jeronýmova', 944, 4, '392 01', 'Sobeslav', 'Sobeslav Jihoceský kraj'),
(121, 70, 'Tyršova', 366, 5, '341 01', 'Horaždovice', 'Horaždovice Plzenský kraj'),
(122, 71, 'Českého odboje', 1568, 45, '518 01', 'Dobruška', 'Dobruška Královéhradecký kraj'),
(123, 72, 'Jiráskova', 675, 15, '538 26', 'Bojanov', 'Bojanov Pardubický kraj'),
(124, 73, 'Zahradní 799', 799, 3, '675 03', 'Budišov U Trebíce', 'Kraj Vysocina'),
(125, 74, 'Pod Strání', 468, 0, '543 71', 'Královéhradecký kraj', 'Hostinné'),
(126, 75, 'Školní', 1782, 1782, '391 65', 'Bechyne', 'Bechyne Jihoceský kraj'),
(127, 76, 'Lesní', 1549, 4, '561 63', 'Nekor', 'Nekor Pardubický kraj'),
(128, 77, 'Jeronýmova', 1573, 0, '588 41', 'Kraj Vysocina', 'Vyskytná Nad Jihlavou');

-- --------------------------------------------------------

--
-- Struktura tabulky `hibernate_sequence`
--

CREATE TABLE `hibernate_sequence` (
  `next_val` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_czech_ci;

--
-- Vypisuji data pro tabulku `hibernate_sequence`
--

INSERT INTO `hibernate_sequence` (`next_val`) VALUES
(136);

-- --------------------------------------------------------

--
-- Struktura tabulky `pojistene`
--

CREATE TABLE `pojistene` (
  `id` int(11) NOT NULL,
  `jmeno` varchar(30) COLLATE utf8_czech_ci DEFAULT NULL,
  `prijmeni` varchar(30) COLLATE utf8_czech_ci DEFAULT NULL,
  `datum_narozeni` date DEFAULT NULL,
  `tel_cislo` varchar(13) COLLATE utf8_czech_ci DEFAULT NULL,
  `email` varchar(60) COLLATE utf8_czech_ci DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_czech_ci;

--
-- Vypisuji data pro tabulku `pojistene`
--

INSERT INTO `pojistene` (`id`, `jmeno`, `prijmeni`, `datum_narozeni`, `tel_cislo`, `email`) VALUES
(47, 'Jan', 'Novák', '1984-11-03', '420606608531', 'brilleimivayou-8222@yopmail.com'),
(48, 'Tomáš', 'Marný', '1942-10-17', '420608605228', 'jibipacuya-6538@yopmail.com'),
(49, 'Josef', 'Nový', '1958-07-10', '420777564321', 'rineizoweiye-3476@yopmail.com'),
(50, 'Alfons', 'Svoboda', '1935-05-15', '420773002154', 'kaugrepousolle-2282@yopmail.com'),
(51, 'Ludmila', 'Dvořáková', '1967-04-17', '420776151637', 'yetreutrutreke-6625@yopmail.com'),
(52, 'Petr', 'Černý', '1995-02-20', '420774897956', 'bauseupruddayi-3167@yopmail.com'),
(53, 'Vladimír', 'Pokorný', '1984-04-18', '420771115641', 'yoveppeuzawo-8833@yopmail.com'),
(54, 'Ondřej', 'Bohatý', '1973-05-14', '420771175641', 'cesugruheimmei-1834@yopmail.com'),
(55, 'Vítezslav', 'Churý', '1969-06-02', '420772261618', 'numesegaffa-4750@yopmail.com'),
(56, 'Pavel', 'Procházka', '1962-07-03', '4207759868123', 'leibefrumema-9213@yopmail.com'),
(57, 'Matěj', 'Horák', '1974-09-10', '4207731353441', 'yeusebeuquiza-4718@yopmail.com'),
(58, 'Jana', 'Veselá', '1976-10-02', '420772516171', 'cauwoyawauprou-4224@yopmail.com'),
(59, 'Miroslav', 'Kučera', '1948-11-03', '4207789868543', 'maciffeuciba-6322@yopmail.com'),
(60, 'František', 'Veselý', '1947-05-09', '420773561623', 'yeppujauhupro-5692@yopmail.com'),
(61, 'Michal', 'Krejčí', '1956-03-07', '420608658941', 'jouqueprapibo-3972@yopmail.com'),
(62, 'Lenka', 'Němcová', '1954-02-11', '420605223351', 'creutuffaunoppe-4716@yopmail.com'),
(63, 'Věra', 'Marková', '1978-01-21', '420602030251', 'yoyousseufreppe-4189@yopmail.com'),
(64, 'Eva', 'Kučerová', '1949-07-26', '420778602036', 'xakoifuvoiza-5546@yopmail.com'),
(65, 'Lucie', 'Novotná', '1973-07-28', '420774445612', 'trommexaubalei-4358@yopmail.com'),
(66, 'Jaroslav', 'Novotný', '1980-08-11', '420603124591', 'didauddefeuquo-1511@yopmail.com'),
(67, 'Petr', 'Dvořák', '1982-09-30', '420602548813', 'lecroirawauneu-6458@yopmail.com'),
(68, 'Jiří', 'Veselý', '1961-01-15', '420608604621', 'mennommennoibri-9787@yopmail.com'),
(69, 'Martina', 'Krejčí', '1950-08-29', '420771602321', 'kalloweuyotau-2164@yopmail.com'),
(70, 'Marie', 'Černá', '1974-02-26', '420778234598', 'disoupefroico-4500@yopmail.com'),
(71, 'Věra', 'Svobodová', '1983-03-02', '420773231741', 'cetreroissele-9212@yopmail.com'),
(72, 'Pavel', 'Dušín', '1991-05-01', '420601010203', 'zelollitrahe-2498@yopmail.com'),
(73, 'Otakar', 'Kovář', '1992-12-17', '420601777127', 'koippemaucreiloi-3918@yopmail.com'),
(74, 'Kateřina', 'Koubová', '1956-11-15', '420601134567', 'goussaravecri-1745@yopmail.com'),
(75, 'Václav', 'Blažek', '1953-10-20', '420604114116', 'fropikeifallu-1071@yopmail.com'),
(76, 'Jan', 'Spáčil', '1967-05-06', '420601555243', 'rohucivibro-5158@yopmail.com'),
(77, 'Zdeněk', 'Malačka', '1946-03-10', '420777538888', 'xeimmauffedeiweu-5477@yopmail.com');

-- --------------------------------------------------------

--
-- Struktura tabulky `pojisteni`
--

CREATE TABLE `pojisteni` (
  `id` int(11) NOT NULL,
  `pojisteny_id` int(11) DEFAULT NULL,
  `nazev_pojisteni` varchar(100) COLLATE utf8_czech_ci DEFAULT NULL,
  `typ_pojisteni` varchar(100) COLLATE utf8_czech_ci DEFAULT NULL,
  `pojistna_castka` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_czech_ci;

--
-- Vypisuji data pro tabulku `pojisteni`
--

INSERT INTO `pojisteni` (`id`, `pojisteny_id`, `nazev_pojisteni`, `typ_pojisteni`, `pojistna_castka`) VALUES
(49, 47, 'Pojistka na blbostí', 'Pojistení hmotné odpovědností', 50000),
(50, 48, 'Zdravotní pojištění', 'Pojistení zdraví osob', 100000),
(51, 49, 'Pojištění životu', 'Pojistení zdraví osob', 5000000),
(52, 50, 'Pojištění byznysu', 'Pojistení majetku', 10000000),
(53, 51, 'Pojistení bytu', 'Pojistení majetku', 5000000),
(54, 51, 'Urazové pojištění', 'Pojistení zdraví osob', 15000),
(55, 52, 'Pojíštení auta', 'Pojistení hmotné odpovědností a majetku cízích osob', 60000),
(56, 52, 'Pojistka na blbostí', 'Pojistení hmotné odpovědností', 40000),
(57, 53, 'Zdravotní pojištění', 'Pojistení zdraví osob', 100000),
(58, 54, 'Povinné ručení', 'Pojistení hmotné odpovědností', 500000),
(59, 55, 'Pojíštěni proti vykradení bytu', 'Pojistení majetku', 600000),
(60, 56, 'Pojistka auta', 'Pojistení hmotné odpovědností a majetku cízích osob', 800000),
(61, 57, 'Pajíštění bankovního vkladu', 'Pojistení majetku', 785999),
(62, 58, 'Pojištění zdraví', 'Pojistení zdraví osob', 480000),
(63, 77, 'Pojištění škod na letadlu', 'Pojistení hmotné odpovědností a majetku cízích osob', 100000),
(64, 76, 'Urazové pojištění', 'Pojistení zdraví osob', 15000),
(65, 76, 'Zdravotní pojištění', 'Pojistení zdraví osob', 80000),
(66, 76, 'Pojistení bytu', 'Pojistení majetku', 5000000),
(67, 75, 'Pojistení bytu', 'Pojistení majetku', 1600000),
(68, 74, 'Pojištění byznysu', 'Pojistení majetku', 50000000),
(69, 73, 'Pojistka na blbostí', 'Pojistení hmotné odpovědností', 50000),
(70, 59, 'Zdravotní pojištění', 'Pojistení zdraví osob', 50000),
(71, 72, 'Pojistka na blbostí', 'Pojistení hmotné odpovědností', 100000),
(72, 71, 'Pojistení bytu', 'Pojistení majetku', 4300000),
(73, 71, 'Urazové pojištění', 'Pojistení zdraví osob', 450000),
(74, 70, 'Urazové pojištění', 'Pojistení zdraví osob', 78000),
(75, 70, 'Pojistení bytu', 'Pojistení majetku', 2500000),
(76, 69, 'Pojistka auta', 'Pojistení hmotné odpovědností a majetku cízích osob', 460000),
(77, 69, 'Pojištění byznysu', 'Pojistení majetku', 860000),
(78, 68, 'Urazové pojištění', 'Pojistení zdraví osob', 30000),
(79, 68, 'Pojištění životu', 'Pojistení zdraví osob', 350000),
(80, 67, 'Zdravotní pojištění', 'Pojistení zdraví osob', 150000),
(81, 67, 'Pojistka auta', 'Pojistení hmotné odpovědností', 640000),
(82, 66, 'Pojištění byznysu', 'Pojistení hmotné odpovědností a majetku cízích osob', 790000),
(83, 66, 'Pojistení bytu', 'Pojistení majetku', 5000000),
(84, 65, 'Pojistka auta', 'Pojistení majetku', 420000),
(85, 65, 'Pojištění zdraví', 'Pojistení zdraví osob', 320000),
(86, 64, 'Pojištění zdraví', 'Pojistení zdraví osob', 50000),
(87, 64, 'Pojíštění lekařské peče', 'Pojistení zdraví osob', 200000),
(88, 63, 'Pojistka auta', 'Pojistení majetku', 450000),
(89, 63, 'Pojistení bytu', 'Pojistení majetku', 1000000),
(90, 62, 'Pojištění byznysu', 'Pojistení hmotné odpovědností', 540000),
(91, 61, 'Pojištění životu', 'Pojistení zdraví osob', 78000),
(92, 61, 'Pojistka na blbostí', 'Pojistení majetku', 150000),
(93, 60, 'Pojistka auta', 'Pojistení hmotné odpovědností a majetku cízích osob', 325000),
(94, 59, 'Pojištění byznysu', 'Pojistení hmotné odpovědností', 800500);

-- --------------------------------------------------------

--
-- Struktura tabulky `pojistne_udalosti`
--

CREATE TABLE `pojistne_udalosti` (
  `id` int(11) NOT NULL,
  `pojisteni_id` int(11) DEFAULT NULL,
  `pojisteny_id` int(11) DEFAULT NULL,
  `datum_udalosti` date DEFAULT NULL,
  `typ_udalosti` varchar(100) COLLATE utf8_czech_ci DEFAULT NULL,
  `popis_udalosti` text COLLATE utf8_czech_ci DEFAULT NULL,
  `vyse_skody` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_czech_ci;

--
-- Indexy pro exportované tabulky
--

--
-- Indexy pro tabulku `adresy`
--
ALTER TABLE `adresy`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `UK_skl2sawb6j82aux350o71r7o6` (`pojisteny_id`);

--
-- Indexy pro tabulku `pojistene`
--
ALTER TABLE `pojistene`
  ADD PRIMARY KEY (`id`);

--
-- Indexy pro tabulku `pojisteni`
--
ALTER TABLE `pojisteni`
  ADD PRIMARY KEY (`id`);

--
-- Indexy pro tabulku `pojistne_udalosti`
--
ALTER TABLE `pojistne_udalosti`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT pro tabulky
--

--
-- AUTO_INCREMENT pro tabulku `adresy`
--
ALTER TABLE `adresy`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=129;

--
-- AUTO_INCREMENT pro tabulku `pojistene`
--
ALTER TABLE `pojistene`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=78;

--
-- AUTO_INCREMENT pro tabulku `pojisteni`
--
ALTER TABLE `pojisteni`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=95;

--
-- AUTO_INCREMENT pro tabulku `pojistne_udalosti`
--
ALTER TABLE `pojistne_udalosti`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- Omezení pro exportované tabulky
--

--
-- Omezení pro tabulku `adresy`
--
ALTER TABLE `adresy`
  ADD CONSTRAINT `FKb1rd6jnhpwnuq263lystm134r` FOREIGN KEY (`pojisteny_id`) REFERENCES `pojistene` (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
