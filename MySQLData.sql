create database eurisbackend;
use eurisbackend;
create table products (
                          serial_number VARCHAR(50) primary key,
                          name VARCHAR(50),
                          pence_shilling_pound VARCHAR(20)
);
insert into products (serial_number, name, price) values
 ('2162641909', 'NITROGEN', '2p 18s 6d'),
 ('7625831892', 'Gabapentin', '12p 15s 10d'),
 ('1109077157', 'Sei Bella Age-Defying Liquid Foundation', '14p 10s 10d'),
 ('6060263402', 'Homeopathic Remedy Kit 30c', '4p 12s 7d'),
 ('1673591531', 'ethosuximide', '12p 15s 10d'),
 ('8882125270', 'Arnica 12c', '14p 10s 10d'),
 ('8726291177', 'potassium chloride', '5p 14s 8d'),
 ('5087206212', 'Stool Softener', '8p 15s 9d'),
 ('9616461710', 'Atenolol', '4p 12s 7d'),
 ('5112619899', 'Paroxetine', '8p 15s 9d'),
 ('8698347215', 'Diaper Rash', '8p 15s 9d'),
 ('2020649470', 'Salicylic Acid', '12p 15s 10d'),
 ('5643295008', 'Hydrocodone Bitartate and Acetaminophen', '8p 15s 9d'),
 ('5197315822', 'Aesculus Hipp Kit Refill', '8p 15s 9d'),
 ('7795979181', 'Infant Dextrose', '8p 15s 9d'),
 ('0628355149', 'Pollens - Trees, Mulberry Mix', '9p 4s 11d'),
 ('8275708214', 'Nu Skin ageLOC Radiant Day Broad Spectrum SPF 22', '5p 14s 8d'),
 ('0758112637', 'Ondansetron', '12p 15s 10d'),
 ('6791518081', 'Oxybutynin Chloride', '12p 15s 10d'),
 ('5225711502', 'sunmark pain reliever', '12p 15s 10d'),
 ('9176034410', 'Metoclopramide Hydrochloride', '14p 10s 10d'),
 ('0161286038', 'Bio Pine', '8p 15s 9d'),
 ('9809841523', 'Terazosin Hydrochloride', '10p 17s 8d'),
 ('4069678328', 'Proactiv Repairing Treatment', '5p 14s 8d'),
 ('5786846806', 'IBS Irritable Bowel Syndrome Relief', '2p 18s 6d'),
 ('0425539156', 'milk of magnesia', '9p 4s 11d'),
 ('4838846290', 'Hydrocodone Bitartrate and Acetaminophen', '8p 15s 9d'),
 ('5386649299', 'Atenolol', '8p 15s 9d'),
 ('4544776147', 'Topcare Stool Softener', '14p 10s 10d'),
 ('1534392009', 'Clarins Vital Light Day SPF 15', '8p 15s 9d');