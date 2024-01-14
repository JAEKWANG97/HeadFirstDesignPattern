package ch02;

public interface Subject {

    //Observer을 인자로 받음. 등록 또는 제거
    public void registerObserver(Observer o);

    public void removeObserver(Observer o);

    // 주제의 상태가 변경되었을 떄 모든 옵저버에게 변경 내용을 알리려고 호출되는 메소드
    public void notifyObservers();
}
