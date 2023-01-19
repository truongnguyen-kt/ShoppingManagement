create database ShoppingManagement
GO
use ShoppingManagement
GO
create table Accounts(
    accID int identity(1,1)primary key,
    email varchar(30)  unique,
    password varchar(30),
    fullname varchar(30),
    phone varchar(12),
    status int check(status =1 or status=0),-- 1:active; 0:inactive
    role int check(role=1 or role=0)    --:admin, 0:user
)
GO
create table Categories(
      CateID int identity(1,1) primary key,
      CateName varchar(30)
)
GO
create table Product(
      PID int identity(1,1) primary key,
      PName varchar(30),
      price int check(price>=0),
      imgPath varchar(50),
      description text,
      status int,    --1:active, 0:inactive
      CateID int foreign key references Categories(CateID)
)
GO
create table Orders(
    OrderID int identity(1,1) primary key,
    OrdDate date,
    shipdate date,
    status int check(status =1 or status=2 or status=3),--1:processing, 2: completed, 3: cancel
    AccID int foreign key references Accounts(AccID)
)
GO
create table OrderDetails(
    DetailId int identity(1,1) primary key,
    OrderID int foreign key references Orders(OrderID),
    FID int foreign key references Product(PID),
    quantity int check(quantity>=1)
)

ALTER TABLE Product
ADD Gender int check(Gender >= 0) -- 0 women, 1 men, 2 kid

insert into Accounts values('admin@gmail.com', 'admin', 'Administrater', '111112929', 1, 1)
insert into Accounts values('user@gmail.com', '12345', 'User', '654321112', 1, 0)
insert into Accounts values('test@gmail.com', '12345', 'Test UserName', '1238930223', 1, 0)

insert into Categories values('Orchid')
insert into Categories values('Lily')
insert into Categories values('Rose')
insert into Categories values('Tulips')
insert into Categories values('Hydrangea')
insert into Categories values('Orange Blossom')
insert into Categories values('Sunflower')


insert into Product values('Sunflower', 41, 'img/lan_1.jpg', 'Large, fresh and luxurious flower shelf with a combination of many types of flowers. This will be a meaningful gift instead of congratulations on the grand opening or important holidays.', 1, 1)
insert into Product values('SHOUTS OF TRIUMPH', 34, 'img/lan_2.jpg', 'The vase of Shouts Of Triumph symbolizes luck and fortune with extremely brilliant beauty combined with daffodils, carnations and happy flowers.', 1, 1)
insert into Product values('RED FLUKE', 30, 'img/lan_3.jpg', 'With red representing success and elegance, the Red Fluke desktop vase will surely bring a brilliant atmosphere to the workspace.', 1, 1)
insert into Product values('AMBER WONDERS', 34, 'img/lan_4.jpg', 'Royal Chrysanthemum represents luck and happiness combined with yellow orchid branches to make your workspace more full of life.', 1, 1)
insert into Product values('FLUKE', 44, 'img/rose_1.jpg', 'The Fluke bouquet is combined with a harmonious and elegant wrapping paper. Perfect choice for Valentines Day or any special occasion', 1, 2)
insert into Product values('STROKE OF LUCK', 40, 'img/rose_2.jpg', 'Lily flower bouquet is combined with wrapping paper harmoniously and elegantly. Perfect choice for Valentine s Day or any special occasion.', 1, 2)
insert into Product values('PINK PRINCESS', 40, 'img/rose_3.jpg', 'Pink Princess bouquet with a harmonious combination of pink and green tones of Cat Tuong, Rose, Carnation and Lily. This will be an unexpected and perfect gift for your loved one, family or friends.', 1, 2)
insert into Product values('A LITTLE SOON CHRISTMAS', 42, 'img/rose_4.jpg', 'Lovely bouquet of Red Carnations, Roses & White Lily suitable for home decoration or gifting to your loved one', 1, 2)
insert into Product values('FELICITY', 39, 'img/li_1.jpg', 'Romantic flower of lily', 1, 3)
insert into Product values('FALL FOR YOU', 39, 'img/li_2.jpg', 'A romantic bouquet of red roses is the perfect gift to say to your loved one on Valentine s Day or anniversaries or birthdays.', 1, 3)
insert into Product values('INTO THE SUN', 40, 'img/li_3.jpg', 'Loose-fitting hoodie with an adjustable hood and long sleeves. Featuring a front pouch pocket and ribbed trims.', 1, 3)
insert into Product values('AUTUMN HAPPINESS', 45, 'img/li_4.jpg', 'Autumn Happiness vase flower bouquet with 3 romantic parts, 7 poetic parts will definitely be an inspiration for a day full of positive energy.', 1, 3)
insert into Product values('WEDDING DRESS BRIDAL', 40, 'img/tulip_1.jpg', 'Transform into an extremely pure and luxurious bride with a bouquet of flowers full of purity called Wedding Dress! A few branches of white roses, a little beautiful tulip and many bunches of flowers will help adorn the memorable wedding of the bride and groom.', 1, 4)
insert into Product values('LE FESTIN', 45, 'img/tulip_2.jpg', 'Make every moment of your life dreamy and memorable with the gentle purple scent of carnations and tulips. Do not forget to add a bit of passion from the unforgettable sweetness of wine in this Le Festin flower box set!', 1, 4)
insert into Product values('PEACE', 31, 'img/tulip_3.jpg', 'Two-piece set. Mock neck sweatshirt with long sleeves. Leggings with an elastic waistband with', 1, 4)
insert into Product values('MY JULIET', 31, 'img/tulip_4.jpg', 'Pastel bouquets are wrapped in Korean style, with very youthful and elegant colors. The combination of Hydrangea and Baby flowers is one of the perfect choices for a special day or any occasion to give to someone you love.', 1, 4)
insert into Product values('SPLIT SUEDE TIME TO CHEER', 49, 'img/ctc_1.jpg', 'The flower shelf is large, fresh and luxurious with a combination of yellow flowers and soft green paper tones. This will be a meaningful gift instead of congratulations on the grand opening or important holidays.', 1, 5)
insert into Product values('ENCHANTED', 45, 'img/ctc_2.jpg', 'Enchanted flower bouquet is a splendid garden showing off in the romantic spring afternoon sunlight, adorned with two pastel colors and red roses of the branches of Rose, Carnation, Dong Tien, Cam Tu Cau, Phi Yen , and lots of Baby flowers, enough to fascinate anyone.', 1, 5)
insert into Product values('MILLION LITTLE THINGS', 42, 'img/ctc_3.jpg', 'The Million Little Things flower bouquet is a lovely gift with Cam Tu Cau surrounded by countless tiny but very pretty Baby flowers, as well as countless small things that make up a beautiful love story between you. and so is the receiver.', 1, 5)
insert into Product values('SERENITY', 39, 'img/ctc_4.jpg', 'Share to the recipient with Serenity Condolence Wreath.', 1, 5)
insert into Product values('LOVE PERFECTION', 29, 'img/cc_1.jpg', 'The combination of gentle and warm carnations from pink and red will surely be a breath of fresh air for flower-loving souls!', 1, 6)
insert into Product values('VIOLET MAJESTY', 25, 'img/cc_2.jpg', 'Elegant and unique bouquet of 2-color Carnations, Violets and Pink Chrysanthemums. Perfect choice for Valentines Day or any special occasion.', 1, 6)
insert into Product values('ROSY ROSIE', 41, 'img/cc_3.jpg', 'The cream cake from extremely sweet roses and carnations will be the most meaningful gift to give to your loved ones.', 1, 6)
insert into Product values('DREAMY SOUL', 39, 'img/cc_4.jpg', 'Lets capture memorable moments with your loved one with this super sweet and romantic rose cream cake!', 1, 6)
insert into Product values('GOLDEN MOMENT', 33, 'img/hd_1.jpg', 'Lets capture memorable moments with your loved one with this super sweet and romantic rose cream cake!', 1, 7)
insert into Product values('MOON RIVER', 40, 'img/hd_2.jpg', 'Moon River Wooden Flower Box with 20 beautiful and radiant rose branches along with yellow sunflowers are planted high and spread, so it is extremely suitable to give to the person you love on special occasions such as congratulations or opening.', 1, 7)
insert into Product values('PRETTY GLORY', 43, 'img/hd_3.jpg', 'Magnificent wooden flower box with the presence of coins and sunflowers - flowers with extremely auspicious meanings for you to send on any important occasion.', 1, 7)
insert into Product values('JOYFUL LIFE', 30, 'img/hd_4.jpg', 'Bright and fresh bouquet with beautifully wrapped Sunflowers. This will be an unexpected and perfect gift for your loved one, family or friends.', 1, 7)

