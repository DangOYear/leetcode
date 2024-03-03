package multi_thread

import (
	"fmt"
	"testing"
	"time"
)

func funA(c1 chan int, c2 chan int) {
	for i := 1; i <= 99; i += 2 {
		<-c2
		if i%2 == 0 {
			continue
		}
		fmt.Println(i)
		c1 <- 1
	}
}

func funB(c1 chan int, c2 chan int) {
	for i := 2; i <= 100; i += 2 {
		<-c1
		if i%2 == 1 {
			continue
		}
		fmt.Println(i)
		c2 <- 1
	}
}

func TestAlternatePrint(t *testing.T) {
	c1 := make(chan int)
	c2 := make(chan int)
	go funA(c1, c2)
	go funB(c1, c2)
	c2 <- 1
	time.Sleep(50000)

}
