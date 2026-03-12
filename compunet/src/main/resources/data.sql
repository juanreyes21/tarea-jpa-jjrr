-- sample data for repository testing

-- types
INSERT INTO "type" (id, name, description, table_name) VALUES
 (1, 'TEXT', 'Free text response', ''),
 (2, 'SINGLE_CHOICE', 'Single-choice question', ''),
 (3, 'MULTIPLE_CHOICE', 'Multiple-choice question', '');

-- survey
INSERT INTO survey (id, name, intro, validation, image_url, outro, styles) VALUES
 (1, 'Customer Satisfaction', 'Please answer the following questions.', 'NONE', '', 'Thank you for your time!', '');

-- sections
INSERT INTO section (id, title, description, flag, order_col, type, background_image, survey_id, section_id) VALUES
 (1, 'General', 'General questions about the user.', '', 1, '', '', 1, NULL),
 (2, 'Feedback', 'Let us know what you think.', '', 2, '', '', 1, NULL);

-- questions
INSERT INTO question (id, name, order_col, section_id, question_id, type) VALUES
 (1, 'How did you hear about us?', 1, 1, NULL, 'TEXT'),
 (2, 'Rate our service (1–5)', 2, 1, NULL, 'SINGLE_CHOICE'),
 (3, 'Which features do you use?', 1, 2, NULL, 'MULTIPLE_CHOICE');

-- option groups
INSERT INTO option_group (id, name) VALUES
 (1, 'Rating'),
 (2, 'Features');

-- options
INSERT INTO "option" (id, name, type, group_id) VALUES
 (1, '1', 'NUMBER', 1),
 (2, '2', 'NUMBER', 1),
 (3, '3', 'NUMBER', 1),
 (4, '4', 'NUMBER', 1),
 (5, '5', 'NUMBER', 1),
 (6, 'Feature A', 'TEXT', 2),
 (7, 'Feature B', 'TEXT', 2),
 (8, 'Feature C', 'TEXT', 2);

-- option_question associations
INSERT INTO option_question (id, question_id, option_id, group_id) VALUES
 (1, 2, 1, 1),
 (2, 2, 2, 1),
 (3, 2, 3, 1),
 (4, 2, 4, 1),
 (5, 2, 5, 1),
 (6, 3, 6, 2),
 (7, 3, 7, 2),
 (8, 3, 8, 2);

-- interview with one set of answers
INSERT INTO interview (id, time_start, time_end, username, interviewer_id, institution_id, survey_id) VALUES
 (1, '2026-03-10T09:00:00', '2026-03-10T09:15:00', 'john.doe', 100, 200, 1);

-- answers for that interview
INSERT INTO answer (id, answer, question_id, interview_id) VALUES
 (1, 'Online search', 1, 1),
 (2, '4', 2, 1),
 (3, 'Feature A,Feature C', 3, 1);
