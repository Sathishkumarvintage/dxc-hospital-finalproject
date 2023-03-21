import { Component } from '@angular/core';

@Component({
  selector: 'app-main',
  templateUrl: './main.component.html',
  styleUrls: ['./main.component.css']
})
export class MainComponent {
submit=false;
show(){
  this.submit=true;
}
view=false;
visible(){
  this.view=true;
}
}
