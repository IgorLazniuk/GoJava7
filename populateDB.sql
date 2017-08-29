
-- -----------------------------------------------------
-- Data for table `mydb`.`developers`
-- -----------------------------------------------------
START TRANSACTION;
USE `mydb`;
INSERT INTO `mydb`.`developers` (`id`, `name`) VALUES (1, 'developer1');
INSERT INTO `mydb`.`developers` (`id`, `name`) VALUES (2, 'developer2');

COMMIT;


-- -----------------------------------------------------
-- Data for table `mydb`.`skills`
-- -----------------------------------------------------
START TRANSACTION;
USE `mydb`;
INSERT INTO `mydb`.`skills` (`id`, `skill`) VALUES (1, 'skill1');
INSERT INTO `mydb`.`skills` (`id`, `skill`) VALUES (2, 'skill2');

COMMIT;


-- -----------------------------------------------------
-- Data for table `mydb`.`developers_has_skills`
-- -----------------------------------------------------
START TRANSACTION;
USE `mydb`;
INSERT INTO `mydb`.`developers_has_skills` (`developers_id`, `skills_id`) VALUES (1, 1);
INSERT INTO `mydb`.`developers_has_skills` (`developers_id`, `skills_id`) VALUES (2, 1);
INSERT INTO `mydb`.`developers_has_skills` (`developers_id`, `skills_id`) VALUES (2, 2);

COMMIT;


-- -----------------------------------------------------
-- Data for table `mydb`.`projects`
-- -----------------------------------------------------
START TRANSACTION;
USE `mydb`;
INSERT INTO `mydb`.`projects` (`id`, `projects`) VALUES (1, 'project1');
INSERT INTO `mydb`.`projects` (`id`, `projects`) VALUES (2, 'project2');

COMMIT;


-- -----------------------------------------------------
-- Data for table `mydb`.`projects_has_developers`
-- -----------------------------------------------------
START TRANSACTION;
USE `mydb`;
INSERT INTO `mydb`.`projects_has_developers` (`projects_id`, `developers_id`) VALUES (1, 1);
INSERT INTO `mydb`.`projects_has_developers` (`projects_id`, `developers_id`) VALUES (1, 2);
INSERT INTO `mydb`.`projects_has_developers` (`projects_id`, `developers_id`) VALUES (2, 1);
INSERT INTO `mydb`.`projects_has_developers` (`projects_id`, `developers_id`) VALUES (2, 2);

COMMIT;


-- -----------------------------------------------------
-- Data for table `mydb`.`companies`
-- -----------------------------------------------------
START TRANSACTION;
USE `mydb`;
INSERT INTO `mydb`.`companies` (`id`, `companies`) VALUES (1, 'company1');
INSERT INTO `mydb`.`companies` (`id`, `companies`) VALUES (2, 'company2');

COMMIT;


-- -----------------------------------------------------
-- Data for table `mydb`.`customers`
-- -----------------------------------------------------
START TRANSACTION;
USE `mydb`;
INSERT INTO `mydb`.`customers` (`id`, `customers`) VALUES (1, 'customer1');
INSERT INTO `mydb`.`customers` (`id`, `customers`) VALUES (2, 'customer2');

COMMIT;


-- -----------------------------------------------------
-- Data for table `mydb`.`customers_has_projects`
-- -----------------------------------------------------
START TRANSACTION;
USE `mydb`;
INSERT INTO `mydb`.`customers_has_projects` (`customers_id`, `projects_id`) VALUES (1, 1);
INSERT INTO `mydb`.`customers_has_projects` (`customers_id`, `projects_id`) VALUES (1, 2);
INSERT INTO `mydb`.`customers_has_projects` (`customers_id`, `projects_id`) VALUES (2, 1);
INSERT INTO `mydb`.`customers_has_projects` (`customers_id`, `projects_id`) VALUES (2, 2);

COMMIT;


-- -----------------------------------------------------
-- Data for table `mydb`.`companies_has_projects`
-- -----------------------------------------------------
START TRANSACTION;
USE `mydb`;
INSERT INTO `mydb`.`companies_has_projects` (`companies_id`, `projects_id`) VALUES (1, 1);
INSERT INTO `mydb`.`companies_has_projects` (`companies_id`, `projects_id`) VALUES (1, 2);
INSERT INTO `mydb`.`companies_has_projects` (`companies_id`, `projects_id`) VALUES (2, 1);
INSERT INTO `mydb`.`companies_has_projects` (`companies_id`, `projects_id`) VALUES (2, 2);

COMMIT;


-- -----------------------------------------------------
-- Data for table `mydb`.`companies_has_developers`
-- -----------------------------------------------------
START TRANSACTION;
USE `mydb`;
INSERT INTO `mydb`.`companies_has_developers` (`companies_id`, `developers_id`) VALUES (1, 1);
INSERT INTO `mydb`.`companies_has_developers` (`companies_id`, `developers_id`) VALUES (2, 2);

COMMIT;

