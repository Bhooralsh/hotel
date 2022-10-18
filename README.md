All URIs start with 
http://localhost:9091/api/v1


Network ------------------------Description


/hotel --------------------------Retrieves All hotels


/hotel/{id} ---------------------Retrieves a specific hotel based on it's ID



/hotel/?sort=name----------------Retrieves All hotels by specific field value in ascending 


/room-------------------------- Retrieves All  rooms



/room/{id} ---------------------Retrieves a specific room based on it's ID


/room/?sort=id------------------Retrieves All room by specific field value in ascending 



/user-------------------------- Retrieves all user


/user/{id}---------------------Retrieves a specific user based on it's ID


/user/?sort=id-------------------Retrieves All user by specific field value in descending  


========================================================================================================================





Database Tables
========================


CREATE TABLE `hotel` (
  `id` varchar(255) NOT NULL,
  `address` varchar(255) DEFAULT NULL,
  `cheapset_price` double NOT NULL,
  `city` varchar(255) DEFAULT NULL,
  `distance` varchar(255) DEFAULT NULL,
  `featured` bit(1) NOT NULL,
  `name` varchar(255) DEFAULT NULL,
  `photo` tinyblob,
  `rating` int NOT NULL,
  `title` varchar(255) DEFAULT NULL,
  `type` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;




CREATE TABLE `room` (
  `id` varchar(255) NOT NULL,
  `max_people` int NOT NULL,
  `price` double NOT NULL,
  `room_number` tinyblob,
  `title` varchar(255) DEFAULT NULL,
  `hotel_id` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FKdosq3ww4h9m2osim6o0lugng8` (`hotel_id`),
  CONSTRAINT `FKdosq3ww4h9m2osim6o0lugng8` FOREIGN KEY (`hotel_id`) REFERENCES `hotel` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;




CREATE TABLE `room_number` (
  `id` varchar(255) NOT NULL,
  `number` int NOT NULL,
  `unavailable_dates` tinyblob,
  `room_id` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FKfrnhujbdl9w2tovfhw3lxn78q` (`room_id`),
  CONSTRAINT `FKfrnhujbdl9w2tovfhw3lxn78q` FOREIGN KEY (`room_id`) REFERENCES `room` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;



CREATE TABLE `user` (
  `id` varchar(255) NOT NULL,
  `city` varchar(255) DEFAULT NULL,
  `country` varchar(255) DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  `img` varchar(255) DEFAULT NULL,
  `is_admin` bit(1) NOT NULL,
  `phone` varchar(255) DEFAULT NULL,
  `username` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;


