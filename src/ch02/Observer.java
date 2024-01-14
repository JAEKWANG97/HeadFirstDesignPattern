package ch02;

public interface Observer {
    public void update();
    //Observer 인터페이스는 모든 옵저버 클래스에서 구현해야함 따라서 모든 옵저버는 update() 메소드를 구현해야
}
