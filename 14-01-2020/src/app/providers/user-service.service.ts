import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class UserServiceService {
details=[];
  constructor() { }

  setUserData(detailsObject){
    this.details.push(detailsObject);
  }
  getData(){
    return this.details;
  }
}
