#KLU NESNEYE YÖNELİK PROGRAMLAMA KISA SINAV 1.2 

**Bu çalışma Bahar Üründiker ve Emine Nur Zengin tarafından birlikte hazırlanmıştır.** 

 

Son yıllarda uygulama geliştirme çok karmaşık bir hale gelmiş bulunmakta.Veritabanından sadece bazı verileri çekip görüntülemekle yetinilmemekte. Bu zamanın geliştiricilerini karmaşık ve veri bakımından zengin kullanıcı arayüzleri oluşturmaya ağırlık vermektedirler.Bu sepeble genel olarak kullanılan API’ler çok zahmetli olmaya başlamaktadır. GraphQL bu sorunlarla başa çıkmak üzere tasarlanmıştır. GraphQL sunucuları, Haskell, JavaScript, Perl, Python, Ruby, Java, C++, C#, Scala, Go, Erlang, PHP ve R dahil olmak üzere birden fazla dilde mevcuttur. 

GraphQL, istemci-sunucu iletişimine modern bir yaklaşımda bulunmaktadır ve geliştiriciler için zengin bir tasarlama ortamı oluşturmak için ortam hazırlanmıştır. İstemciye `istediği veriyi sorgulama ve sorma  özgürlüğü ` tanınmaktadır. Bu özellik kullanıcıların sadece ihtiyacı olan veriyi alabilmelerine olanak sağlayıp gereksiz verilerle uğraşmamalarını sağlar.Aynı zamanda bu şekilde performans artışını ve ağ trafiğinin düzenlenmesini sağlar. 

Kullanıcının daha rahat ve geniş bir kontrol düzeni elde etmesine yardımcı olur.Kullanıcı istediği durmda yeni alanlar ekleyebilir ya da var olan alanları değiştirebilir.Bu şekilde kullanıcının performansını arttırır ve zaman kaybını minimum seviyeye düşürür. AyrıcaGraphQL perspektifinden baktığımızda endpoint karmaşalarıyla karşılaşmıyoruz.GraphQL sorguları bekleyen tek bir endpoint bizi karşılıyor.Burada tüm taleplerimizi yerine getirmemiz gerekiyor.Ayrıca aynı sorguda birden fazla veriyi alma olanağımız da var. 

Her sorgulama dilinde olduğu gibi GraphQL’in de kendine özgü terimleri bulunmaktadır.Bu GraphQL özgü terimleri dört ana başlık altında toplayabiliriz. Bunlar `Query(Sorgu)`, `Mutation(Mutasyon) `,`Subscription(Abonelik)` ve `Schema(Şema)`. 

API geliştiricileri, müşterilerin bu hizmet aracılığıyla sorgulayabileceği tüm olası verileri açıklayan bir şema oluşturmak için GraphQL'i kullanır.GraphQL şeması, hangi tür nesneyi isteyebileceğinizi ve bu nesnenin hangi alanlara sahip olduğunu tanımlayan nesne türlerinden oluşur. Sorgular geldikçe GraphQL sorguları şemaya göre doğrular. GraphQL daha sonra doğrulanmış sorguları yürütür.API geliştiricisi şemadaki her alanı çözümleyici adı verilen bir işleve ekler. Yürütme sırasında, değeri üretmek için çözümleyici çağrılır. 

Facebook, kullanıcı verilerini daha etkili bir şekilde almak ve yönetmek amacıyla RESTful API'lerin yerine daha kullanışlı bir çözüm arayışında bulunmaktaydı ve bu sayede GraphQL ortaya çıktı. React'a benzer şekilde GraphQL, 2012 yılında Facebook tarafından dahili olarak geliştirildi ve 2015 yılında halka açık hale getirildi. GraphQL'in açık kaynak haline getirilmesinin ardından, GraphQL projesi Facebook'tan, Linux Vakfı'nın ev sahipliği yaptığı yeni kurulan GraphQL Vakfı'na taşındı (2018).  

Peki bu kadar bilgiden sonra şunu da unutmadan geçmeyelim.GraphQL’in dezavantajları nelerdir peki? 

 
–GraphQL, veri sorgulama işinin çoğunu sunucu tarafına kaydırır ve bu da sunucu geliştiricileri için karmaşıklık katar. 
–GraphQL, nasıl uygulandığına bağlı olarak, özellikle hız limitleri ve fiyatlandırma göz önüne alındığında, REST API'lerden farklı API yönetim stratejileri gerektirebilir.Bu da Rest API’lere alışkın olan geliştiriciler için bir zorlanma süreci ortaya çıkarır. 
–Önbellek işlemleri, REST'e göre daha karmaşıktır.API geliştiricilernin sürdürülebilir GraphQL şeması yazma gibi ek görevleri vardır. 
