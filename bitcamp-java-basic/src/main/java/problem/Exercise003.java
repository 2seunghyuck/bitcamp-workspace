package problem;
//연습문제 6-19
class Mytv {
  boolean isPowerOn;
  int channel;
  int volume;

  final int MAX_VOLUME = 100;
  final int MIN_VOLUME = 0;
  final int MAX_CHANNEL = 100;
  final int MIN_CHANNEL = 1;


  void turnOnOff() { // isPowerON 값이 true면false 로 바꾸기
    isPowerOn = !isPowerOn;
  }


  void volumeUp() {
    // volume < MAX_VOLUME 면 값을 1 증가
    if (volume < MAX_VOLUME)
      volume++;
  }

  void volumeDown() {
    // volume > MIN_VOLUME 면 값을 1 감소
    if (volume > MIN_VOLUME)
      volume--;
  }

  void channelUP() {
    // channel 값을 1 증가
    // MAX_CHANNEL이면 MIN_CHANNEL 으로 바꾼다
    if (channel == MAX_CHANNEL)
      channel = MIN_CHANNEL;
    else
      channel++;
  }

  void channelDown() {
    if (channel == MIN_CHANNEL)
      channel = MAX_CHANNEL;
    else
      channel--;
  }
}


class Exercise003 {

  public static void main(String[] args) {
    Mytv t = new Mytv();

    t.channel = 100;
    t.volume = 0;
    System.out.println("CH:" + t.channel + ", VOL:" + t.volume);

    t.channelDown();
    t.volumeDown();
    System.out.println("CH:" + t.channel + ", VOL:" + t.volume);

    t.volume = 100;
    t.channelUP();
    t.volumeUp();
    System.out.println("CH:" + t.channel + ", VOL:" + t.volume);
  }
}
