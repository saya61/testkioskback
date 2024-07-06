package com.example.testkioskback;

import com.example.testkioskback.model.Product;
import com.example.testkioskback.repository.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final ProductRepository productRepository;

    public DataLoader(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        // 더미 데이터 생성
        productRepository.save(new Product("아메리카노", 3000, "깔끔하고 풍부한 에스프레소의 맛을 즐길 수 있는 커피", "coffee"));
        productRepository.save(new Product("카페 라떼", 3500, "부드러운 우유 거품과 진한 에스프레소의 조화", "coffee"));
        productRepository.save(new Product("바닐라 라떼", 3800, "부드러운 라떼에 달콤한 바닐라 향이 더해진 coffee", "coffee"));
        productRepository.save(new Product("카푸치노", 3500, "진한 에스프레소에 우유와 거품을 올린 coffee", "coffee"));
        productRepository.save(new Product("카페 모카", 3800, "초콜릿의 달콤함과 coffee의 쌉쌀함이 어우러진 coffee", "coffee"));
        productRepository.save(new Product("헤이즐넛 라떼", 3800, "고소한 헤이즐넛 향이 가미된 부드러운 라떼", "coffee"));
        productRepository.save(new Product("더치 coffee", 4000, "천천히 추출하여 깔끔하고 깊은 맛이 특징인 coffee", "coffee"));
        productRepository.save(new Product("콜드브루 아메리카노", 4000, "시원하고 깔끔한 콜드브루 커피", "coldbrew"));
        productRepository.save(new Product("coldbrew 라떼", 4500, "coldbrew 커피에 우유를 더해 부드럽고 시원한 맛", "coldbrew"));
        productRepository.save(new Product("바닐라 coldbrew", 4800, "coldbrew 라떼에 바닐라 시럽을 더해 달콤한 맛", "coldbrew"));
        productRepository.save(new Product("헤이즐넛 coldbrew", 4800, "고소한 헤이즐넛 향을 더한 coldbrew 라떼", "coldbrew"));
        productRepository.save(new Product("더치 coldbrew", 4000, "시원하고 깔끔한 더치 커피", "coldbrew"));
        productRepository.save(new Product("coldbrew 티", 3500, "coldbrew 방식으로 추출한 시원한 차", "coldbrew"));
        productRepository.save(new Product("coldbrew 모카", 4800, "coldbrew 커피에 초콜릿을 더해 달콤하고 시원한 맛", "coldbrew"));
        productRepository.save(new Product("핫 초코", 3500, "진한 초콜릿 맛을 즐길 수 있는 따뜻한 음료", "noncoffee"));
        productRepository.save(new Product("초코 라떼", 3800, "부드럽고 달콤한 초콜릿 라떼", "noncoffee"));
        productRepository.save(new Product("녹차 라떼", 3800, "부드럽고 고소한 녹차 라떼", "noncoffee"));
        productRepository.save(new Product("고구마 라떼", 3800, "달콤하고 고소한 고구마 라떼", "noncoffee"));
        productRepository.save(new Product("밀크티", 3800, "홍차와 우유의 조화로 달콤한 맛을 더한 음료", "noncoffee"));
        productRepository.save(new Product("딸기 라떼", 4000, "상큼한 딸기와 부드러운 우유의 조화", "noncoffee"));
        productRepository.save(new Product("바나나 라떼", 4000, "달콤한 바나나와 부드러운 우유의 조화", "noncoffee"));
        productRepository.save(new Product("레몬 티", 3000, "상큼한 레몬 향이 더해진 차", "teaade"));
        productRepository.save(new Product("자몽 에이드", 4000, "상큼한 자몽 맛을 즐길 수 있는 탄산 음료", "teaade"));
        productRepository.save(new Product("복숭아 아이스티", 3500, "달콤한 복숭아 향이 더해진 시원한 아이스티", "teaade"));
        productRepository.save(new Product("청포도 에이드", 4000, "상큼한 청포도 맛의 탄산 음료", "teaade"));
        productRepository.save(new Product("유자차", 3000, "달콤하고 향긋한 유자차", "teaade"));
        productRepository.save(new Product("캐모마일 티", 3000, "부드럽고 향긋한 캐모마일 차", "teaade"));
        productRepository.save(new Product("히비스커스 티", 3000, "상큼하고 새콤한 히비스커스 차", "teaade"));
        productRepository.save(new Product("초코 프라페", 4500, "진한 초콜릿과 시원한 얼음의 조화", "frappesmoothie"));
        productRepository.save(new Product("망고 블렌디드", 4500, "달콤한 망고와 시원한 얼음을 함께 갈아 만든 음료", "frappesmoothie"));
        productRepository.save(new Product("그린티 프라페", 4500, "부드러운 녹차와 시원한 얼음을 함께 갈아 만든 음료", "frappesmoothie"));
        productRepository.save(new Product("딸기 프라페", 4500, "상큼한 딸기와 시원한 얼음을 함께 갈아 만든 음료", "frappesmoothie"));
        productRepository.save(new Product("블루베리 프라페", 4500, "달콤한 블루베리와 시원한 얼음을 함께 갈아 만든 음료", "frappesmoothie"));
        productRepository.save(new Product("요거트 블렌디드", 4500, "부드러운 요거트와 시원한 얼음을 함께 갈아 만든 음료", "frappesmoothie"));
        productRepository.save(new Product("커피 프라페", 4500, "진한 커피와 시원한 얼음을 함께 갈아 만든 음료", "frappesmoothie"));
        productRepository.save(new Product("크로와상", 3000, "바삭하고 부드러운 버터 향의 크로와상", "food"));
        productRepository.save(new Product("블루베리 머핀", 3500, "달콤한 블루베리가 들어간 촉촉한 머핀", "food"));
        productRepository.save(new Product("치즈 케이크", 4000, "부드럽고 진한 치즈 맛의 케이크", "food"));
        productRepository.save(new Product("초코 칩 쿠키", 2000, "바삭한 쿠키에 초콜릿 칩이 듬뿍 들어간 달콤한 간식", "food"));
        productRepository.save(new Product("마스카포네 티라미수", 4500, "진한 에스프레소를 적신 부드러운 핑거 쿠키와 풍미가 가득한 마스카포네 치즈 크림이 어우러져 환상의 궁합을 자랑하는 티라미수 케이크", "food"));
        productRepository.save(new Product("샌드위치", 4500, "고소한 맛과 풍미가 살아있는 호밀 브레드를 로프로 구운 후 호밀 브레드를 적당한 두께감으로 커팅하고 그 슬라이스 사이에 모짜렐라치즈, 체다 치즈, 에멘탈치즈까지, 3가지 치즈를 믹스해서 샌딩한 샌드위치", "food"));
        productRepository.save(new Product("베이글", 3000, "쫄깃하면서도 촉촉하고 담백한 플레인 베이글", "food"));
        productRepository.save(new Product("바나나 우유", 1500, "달콤한 바나나 맛 우유", "rtd"));
        productRepository.save(new Product("초코 우유", 1500, "진한 초콜릿 맛 우유", "rtd"));
        productRepository.save(new Product("딸기 우유", 1500, "상큼한 딸기 맛 우유", "rtd"));
        productRepository.save(new Product("요거트 드링크", 2000, "상큼하고 부드러운 요거트 음료", "rtd"));
        productRepository.save(new Product("아쿠아파나", 2500, "미네랄이 함유된 무탄산 워터", "rtd"));
        productRepository.save(new Product("골드메달 애플주스", 3500, "설탕과 물이 들어가지 않은 100% 프리미엄 사과주스", "rtd"));
        productRepository.save(new Product("분다버그", 3000, "호주에서 온 자연발효 탄산음료", "rtd"));
        productRepository.save(new Product("머그컵", 10000, "다양한 디자인의 머그컵", "md"));
        productRepository.save(new Product("텀블러", 15000, "휴대가 간편한 다양한 디자인의 텀블러", "md"));
        productRepository.save(new Product("에코백", 8000, "친환경 재료로 만든 에코백", "md"));
        productRepository.save(new Product("매트블랙 콜드 텀블러", 18000, "스타일리시한 매트블랙 디자인의 콜드 텀블러", "md"));
        productRepository.save(new Product("리유저블 핫 컵", 12000, "재사용 가능한 핫 컵", "md"));
        productRepository.save(new Product("커피백 브라질", 5000, "브라질산 커피가 담긴 커피백", "md"));
        productRepository.save(new Product("커피백 에티오피아", 5000, "에티오피아산 커피가 담긴 커피백", "md"));
    }
}
