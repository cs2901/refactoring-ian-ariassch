if (!isSummer) {
  charge = quantity * winterRate + winterServiceCharge;
}
else {
  charge = quantity * summerRate;
}

bool isSummer()
        {
            if(date.before(SUMMER_START) || date.after(SUMMER_END){return 0;}
            else return 1;
        }