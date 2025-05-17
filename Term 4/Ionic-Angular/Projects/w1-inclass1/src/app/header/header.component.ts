import { Component } from '@angular/core';
import { Student } from '../student';

@Component({
  selector: 'app-header',
  imports: [],
  templateUrl: './header.component.html',
  styleUrl: './header.component.css'
})
export class HeaderComponent {

  sname:String = "Carlos Rebelo";
  currStudent:Student = {sid: 991729616, sname:"Carlos Rebelo", scampus: "Trafalgar", slogin:"rebeloca"};

}
