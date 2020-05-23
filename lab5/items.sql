
CREATE TABLE `items` (
	`id` INT NOT NULL,
	`name` VARCHAR(50) NULL DEFAULT NULL,
	`price` FLOAT NULL DEFAULT NULL,
	`category` VARCHAR(50) NULL DEFAULT NULL,
	`expire` INT NULL DEFAULT NULL,
	`incomeTimestamp` INT NULL DEFAULT NULL,
	PRIMARY KEY (`id`)
)

INSERT INTO `items` (`id`, `name`, `price`, `category`, `expire`, `incomeTimestamp`) VALUES (1, 'item1', 10, 'FOOD', 120, 1582311198);
INSERT INTO `items` (`id`, `name`, `price`, `category`, `expire`, `incomeTimestamp`) VALUES (2, 'item2', 20, 'FOOD', 120, 1582311198);
INSERT INTO `items` (`id`, `name`, `price`, `category`, `expire`, `incomeTimestamp`) VALUES (3, 'item3', 30, 'FOOD', 120, 1582311198);
INSERT INTO `items` (`id`, `name`, `price`, `category`, `expire`, `incomeTimestamp`) VALUES (4, 'item4', 40, 'GENERAL', 120, 1582311198);