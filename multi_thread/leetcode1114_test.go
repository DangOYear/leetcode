package multi_thread

import (
	"fmt"
	"sync"
	"testing"
	"time"
)

var wg1 sync.WaitGroup
var wg2 sync.WaitGroup

func first() {

	fmt.Println("first")
	wg1.Done()
}

func second() {
	wg1.Wait()
	fmt.Println("second")
	wg2.Done()
}

func third() {
	wg2.Wait()
	fmt.Println("third")
}

func TestLeetCode1114(t *testing.T) {

	wg1.Add(1)
	wg2.Add(1)
	go first()
	go second()
	go third()

	time.Sleep(5000)
}
