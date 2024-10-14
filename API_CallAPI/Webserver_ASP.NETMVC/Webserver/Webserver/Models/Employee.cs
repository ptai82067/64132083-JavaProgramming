using System;
using System.Collections.Generic;
using System.Linq;
using System.Runtime.Serialization;
using System.Web;

namespace Webserver.Models
{
    [DataContract]
    public class Employee
    {
        [DataMember]
        public int Id { get; set; }
        [DataMember]
        public string Name { get; set; }
        [DataMember]
        public String Position {  get; set; }
        public Employee(int Id, String Name, String Position) 
        {
            this.Id = Id;
            this.Name = Name;
            this.Position = Position;
        }
    }
}