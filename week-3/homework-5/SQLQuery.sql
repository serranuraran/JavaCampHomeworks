Select ContactName Adi,CompanyName Sirketadi,City Sehir from Customers      --(select ten sonra gelen kısım kolonlardır. *yıldız demek tüm kolonları from=nerden, customers tablosundan demek... adi,şirketadi alias dedik

Select * from Customers where City='London'        --şehri londra olanları getir..metinler tek tırnakla

--case insensitive küçük büyük harf duyarsız
sElEcT * from Products where CategoryID=1 or CategoryID=3

sElEcT * from Products where CategoryID=1 and UnitPrice<>10       --10dan farklı olanları getir demek <>

select * from Products order by ProductName  --order by sırala yani diyor ki bütün ürünleri seç ama ürün ismine göre sırala

select * from Products order by CategoryID,ProductName     --her kategoride alfabetik kategoriler yani kategoriıd leri kendi arasında ürün ismine göre

select * from Products order by UnitPrice  asc --fiyata göre sırala demek  ascending=artan   desc dersen descending=azalan(düşen diye kodlayabilirsin)

select * from Products where categoryId=1 order by UnitPrice desc --kategori ıd'si 1 olanları filtrele onları azalan fiyata göre getir

select count(*) from Products  --count tüm satırları say demek sayısını ver demek (çalıştırdığımızda tek bir kolon tek bir satır gelmesi gerekiyor).group by olmadığı için tablonun tamamını

select count(*) from Products where CategoryID=2 --2 numaralı katogoride kaç ürününüz var

select count(*) Adet from Products where CategoryID=2   --yukarıdakine alias ekleyebilirsin

--hangi kategoride kaç farklı ürünümüz var. tüm kategorileri ayrı ayrı denilirse
select * from Products group by CategoryID --yandaki çalışmaz. bu şu demek bana, datamı kategori ıd'ye göre grupla demek dolayısıyla burda yıldız olmaz. group by kullandığınız zaman select ettiğiniz kolon sadece ve sadece group by'da yazdığınız alan olabilir ve kümülatif datalar olabilir

--yukarının doğrusu
select categoryID from Products group by CategoryID   --bütün kategorileri bana tekrar etmeyecek şekilde listele demek
--sen bir group by yaptığın zaman aslında her bir grup için arka planda bir tablo oluşturuluyormuş gibi düşünebilirsin

select categoryID,count(*) from Products group by CategoryID  --bunu diyebilirsin..(herbir kategori için bir grubun oluşuyor.her katogori için ayrı ayrı hesaplanıyor

--ürün sayısı 10 dan az olan kategorileri listele
select categoryID,count(*) from Products group by CategoryID having count(*)<10

select categoryID,count(*) from Products where UnitPrice>20 group by CategoryID having count(*)<10   --birim fiyatı 20den az olan ürünleri, kategori ıd'ye göre grupla,onlardan da sayısı 10dan az olanları

--select * from products inner join Categories --hem products hem de categorilerin bir araya getirilmiş şekli

select Products.ProductID, Products.ProductName, Products.UnitPrice, Categories.CategoryName
from Products inner join Categories 
on Products.CategoryID = Categories.CategoryID  --onlar eşitse onları yan yana getir demek on=koşul demek
where Products.UnitPrice>10

--inner join, sadece 2tabloda da eşleşenleri bir araya getirir.eşleşmeyen data varsa onu getirmez

--her zaman joinlerde yıldızla başlayın
--genelde joinlerde kısaltma kullanılır -->product'a p diyorum order details'e od diyorum
--inner join sadece eşleşen kayıtları getirir

select * from Products p left join [Order Details] od          --solda olup sağda olmayanları da getir demek.yani ürünler tablosunda var ama hiç satışı yok
on p.ProductID=od.ProductID

select * from Customers c inner join Orders o
on c.CustomerID=o.CustomerID

select * from Customers c left join Orders o
on c.CustomerID=o.CustomerID   --left yapınca 2 arttı.
where o.CustomerID is null     --hiç ürün almamışlar. null demek o data yok demek

--right join =sağda olup solda olmayanları getirir BU ŞEKİLDE BAKMA ASLINDA BİZDEN HİÇ ÜRÜN ALMAYAN GİBİ BAK

--2den fazla tabloyu join etmek istersek
select * from Products p inner join [Order Details] od  
on p.ProductID=od.ProductID
inner join Orders o
on o.OrderID=o.OrderID