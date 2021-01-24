# Ödev SOS Oyunu

|   | 1 | 2 | 3 |
|---|---|---|---|
| 1 | s | s | s |
| 2 | s | o | s |
| 3 | o | o | s |

Kare şeklinde nxn kutulardan oluşan bir panelde iki kişi tarafından oynanan bir oyundur. Oyun sırasında
her bir kutuya **s** yada **o** harflerinden biri yerleştirilir. Oyunun başında hangi oyuncunun 
başlayacağına karar verilir. Amaç bir harf koyduğumuzda yatayda, dikeyde yada çarprazda **SOS**
kelimesini oluşturmaktır. SOS kelimesini oluşturan oyuncu 1 puan alır 
Panel üzerinde hiç boş kutu kalmayana kadar oyun oynanır, sonunda en çok puanı alan oyunu kazanır.

## Kurallar
1. Panel büyüklüğü oyunun en başında konsoldan girdi olarak alınır. Minimum 3x3 maksimum 7x7 büyüklüğünde olmalıdır.
2. Oyun bir kullanıcı tarafından bilgisayara karşı oynanır.
3. Hangi oyuncunun ilk başlayacağına random karar verilir.
4. Oyuncu hangi kutuya harfini girmek istediğini satır ve sütun numarasını konsoldan girerek belli eder.
5. Bilgisayar hangi kutuya harf yazacağına panel üzerindeki boş kutulardan birini random seçerek karar verir.
6. Panele her karakter girişinde panelin güncel hali satır ve sütun numaraları ile birlikte ve oyuncuların puan durumu
   ekranda gösterilir.
7. Dolu kutulara harf yazılmasına izin verilmez.
   
