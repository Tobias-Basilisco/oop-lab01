class Train{
    int nTotSeats;
    int nFirstClassSeats;
    int nSecondClassSeats;
    int nFirstClassReservedSeats;
    int nSecondClassReservedSeats;

    void build(int nFirstClassSeats, int nSecondClassSeats){
        this.nFirstClassSeats = nFirstClassSeats;
        this.nSecondClassSeats = nSecondClassSeats;
        this.nTotSeats = nFirstClassSeats + nSecondClassSeats;
    }

    void reserveFirstClassSeats(int nBookFirstClassSeats){
        if (nBookFirstClassSeats > (this.nFirstClassSeats - this.nFirstClassReservedSeats)){
            System.out.println("Capacity for first class exceeded");
            return;
        }

        this.nFirstClassReservedSeats += nBookFirstClassSeats;
    }

    void reserveSecondClassSeats(int nBookSecondClassSeats){
        if (nBookSecondClassSeats > (this.nSecondClassSeats - this.nSecondClassReservedSeats)){
            System.out.println("Capacity for first class exceeded");
            return;
        }

        this.nSecondClassReservedSeats += nBookSecondClassSeats;
    }

    double getTotOccupancyRatio(){
        return (double)(this.nFirstClassReservedSeats + this.nSecondClassReservedSeats)*100 / this.nTotSeats;
    }

    double getFirstClassOccupancyRatio(){
        return (double)this.nFirstClassReservedSeats * 100 / this.nFirstClassSeats;
    }

    double getSecondClassOccupancyRatio(){
        return (double)this.nSecondClassReservedSeats * 100 / this.nSecondClassSeats;
    }

    void deleteAllReservations(){
        this.nFirstClassReservedSeats = 0;
        this.nSecondClassReservedSeats = 0;
    }
}