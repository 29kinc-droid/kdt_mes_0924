package 제네릭실습;

// T는 타입 변수를 의미하고, 예약어는 아님, 기본 타입은 올 수 없음
public class GenericPrinter<T extends Material> {
    private T material;

    public void setMaterial(T material) {
        this.material = material;
    }
    public T getMaterial() {
        return material;
    }
    @Override
    public String toString() {
        return material.toString();
    }

}
