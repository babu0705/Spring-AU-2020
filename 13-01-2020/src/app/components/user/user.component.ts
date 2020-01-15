// import { Component, OnInit } from '@angular/core';
// import { UserServiceService } from 'src/app/providers/user-service.service';

// @Component({
//   selector: 'app-user',
//   templateUrl: './user.component.html',
//   styleUrls: ['./user.component.scss']
// })
// export class UserComponent implements OnInit {
// data=[];
//   constructor(public serVar: UserServiceService) { }

//   ngOnInit() {
//     this.data=this.serVar.getData()
//   }

// }

import { Component, OnInit } from '@angular/core';
import { UserServiceService } from 'src/app/providers/user-service.service';
@Component({
    selector: 'app-user',
    templateUrl: './user.component.html',
    styleUrls: ['./user.component.scss']
  })
export class UserComponent implements OnInit {

  constructor(public serVar: UserServiceService) { }
  data=[]
  ngOnInit() {
    this.data=this.serVar.getData();
  }

  
    delete(selectedItem: any) {
      for (let user of this.data) {
        if (user.email === selectedItem.email&&user.Contact===selectedItem.Contact) {
            this.data.splice(this.data.indexOf(user), 1);
            break;

        }
    }

  }
   

}
