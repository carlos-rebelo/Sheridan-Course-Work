import { Component } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { C1Component } from './c1/c1.component';
import { C2Component } from './c2/c2.component';

@Component({
  selector: 'app-root',
  imports: [RouterOutlet, C1Component, C2Component],
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  title = 'w1-inclass2';
  homeData = {class: 'SYST35300', desc: 'Hybrid Mobile App Development'}
  myMsg = {fname: '', lname: ''};
  getMsg($event:any) {
    this.myMsg = $event;
  }
}
