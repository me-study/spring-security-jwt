INSERT INTO user_info (id, user_name, password, enabled)
    VALUES (1, 'user', '$2a$10$W/xy5J6KCtmoOGNF4u5DFecSww37eDN263ukWcvq/XaMbFE4y96.m', true);

INSERT INTO user_info (id, user_name, password, enabled)
    VALUES (2, 'admin', '$2a$10$W/xy5J6KCtmoOGNF4u5DFecSww37eDN263ukWcvq/XaMbFE4y96.m', true);


INSERT INTO authority (id, authority)
    VALUES  (1, 'ROLE_USER');

INSERT INTO authority (id, authority)
    VALUES  (2, 'ROLE_ADMIN');


INSERT INTO user_info_authorities (user_info_id, authorities_id)
    VALUES  (1, 1);

INSERT INTO user_info_authorities (user_info_id, authorities_id)
    VALUES  (2, 2);